package com.practice.test.java8concept.practice;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\'' + '}';
    }

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("JoY", 25, "Male"),
                new Person("Alice", 35, "Female"),
                new Person("Bob", 40, "Male"),
                new Person("Jenny", 30, "Female"),
                new Person("Jake", 45, "Male"),
                new Person("Jake", 11, "Male")

        );
        // 1. Find the average age of all persons.
        double averageAge = persons.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println("averageAge====>"+averageAge);
        // 2. Group persons by gender and calculate the average age for each gender.
        Map<String, Double> mapAveAge = persons.stream().collect(Collectors.groupingBy(Person::getGender, Collectors.averagingInt(Person::getAge)));
        System.out.println("mapAveAge=====>"+mapAveAge);
        // 3. Find the oldest person in the list.
        Optional<Person> optionalPerson = persons.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).findFirst();

        /// =================== OR ======================
        String oldestPersonName = persons.stream().max(Comparator.comparingInt(Person::getAge)).map(Person::getName).get();
        System.out.println("oldestPersonName=====>"+oldestPersonName);
        optionalPerson.ifPresent(person -> System.out.println("Oldest Person==>"+person.getName()));
        // 3rd oldest person in the list
        Optional<Person> thirdHighestAge = persons.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).skip(2).findFirst();
        thirdHighestAge.ifPresent(person -> System.out.println("3rd Oldest Person==>"+person.getName()));
        // 4. Filter out persons older than 30 and print their names in uppercase sorted alphabetically.
//        persons.stream().filter(person -> person.getAge()>30).sorted(Comparator.comparing(Person::getName)).map(person -> person.getName().toUpperCase()).;
        List<String> personNameLst = persons.stream()
                .filter(person -> person.getAge()>30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Person over 30 age list ===>"+personNameLst);
        // 5. Check if there is at least one person whose age is divisible by 5.
        boolean isPersonDivisableBy5 = persons.stream().anyMatch(person -> person.getAge() % 5 == 0);
        System.out.println("isPersonDivisableBy5===>"+isPersonDivisableBy5);
        // 6. Find the sum of ages of all persons whose name starts with 'J'.
        int averageSumOfPersonStartWithJ = persons.stream().filter(person -> person.getName().startsWith("J")).mapToInt(Person::getAge).sum();
        System.out.println("averageSumOfPersonStartWithJ : "+averageSumOfPersonStartWithJ);

        // 1. Find the average age of all persons whose names have more than 3 characters and are unique.
        double averageAgeContain3uniqueLatter =
                 persons.stream()
                .map(Person::getName)
                .distinct()
                .filter(name -> name.length() > 3)
                .mapToInt(name -> persons.stream().filter(person -> person.getName().equals(name)).findFirst().get().getAge())
                .average()
                .orElse(0);
        System.out.println("averageAgeContain3uniqueLatter======>"+averageAgeContain3uniqueLatter);
        // 2. Group persons by gender and calculate the average age for each gender, only considering persons older than 25.
        Map<String, Double> avgAgeByGenderMoreThan25 = persons.stream()
                .filter(person -> person.getAge()>25)
                .collect(Collectors.groupingBy(Person::getGender, Collectors.averagingInt(Person::getAge)));
        System.out.println("Average Age by Gender (age > 25): " + avgAgeByGenderMoreThan25);

        // 3. Find the two oldest persons in the list.
        List<Person> twoOldestPersons = persons.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).limit(2).collect(Collectors.toList());
        System.out.println("Two Oldest Persons: " + twoOldestPersons);
        // 4. Filter out persons older than 30 and print their names in uppercase sorted by age in descending order.
        List<String> namesOfPersonsOver30 = persons.stream().filter(person -> person.getAge()>30).sorted(Comparator.comparingInt(Person::getAge).reversed())
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Persons over 30 (names in uppercase, sorted by age desc): " + namesOfPersonsOver30);
        // 5. Check if there is at least one person whose age is a prime number.
        boolean hasPrimeAge = persons.stream()
                .map(Person::getAge)
                .anyMatch(Person::isPrime);
        System.out.println("Is there a person whose age is a prime number? " + hasPrimeAge);
        // 6. Find the sum of ages of all persons whose name starts with 'J' and ends with 'y'.
        int averageSumOfPersonStartWithJAndEndWithY = persons.stream().filter(person -> person.getName().startsWith("J") && person.getName().endsWith("Y")).mapToInt(Person::getAge).sum();
        System.out.println("Sum of ages of persons with names starting with 'J' and ending with 'y': " + averageSumOfPersonStartWithJAndEndWithY);
        // 1. Find the average age of persons whose names contain the letter 'a' and have an age that is a multiple of 5.
        double averageAge1 =persons.stream()
                .filter(person -> person.getName().contains("a"))
                .filter(person -> person.getAge()%5==0)
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println("Average Age of persons with 'a' in name and age multiple of 5: " + averageAge1);
        // 2. Group persons by the first letter of their name and find the oldest person in each group.
        Map<Character, Long> collect = persons.stream().collect(Collectors.groupingBy(person -> person.getName().charAt(0), Collectors.counting()));
        System.out.println("collect====>"+collect); // extend to next level
        Map<Character, Optional<Person>> collect1 = persons.stream()
                .collect(Collectors.groupingBy(person -> person.getName().charAt(0), Collectors.maxBy(Comparator.comparingInt(Person::getAge))));
        // 4. Filter out persons younger than 25 and print their names in lowercase sorted by the second letter of their names.
        List<String> namesYoungerThan25 = persons.stream()
                .filter(person -> person.getAge() < 25)
                .sorted(Comparator.comparingInt(person -> person.getName().charAt(1)))
                .map(Person::getName)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Persons younger than 25 (names in lowercase, sorted by second letter): " + namesYoungerThan25);
        // 5. Check if all persons are above the age of 20 and have a name that ends with a vowel.
        boolean allAbove20AndEndWithVowel =
                 persons.stream()
                .allMatch(person -> person.getAge() > 20 && isVowel(person.getName().charAt(person.getName().length() - 1)));
        System.out.println("Are all persons above 20 and names end with a vowel? " + allAbove20AndEndWithVowel);

        // 6. Find the sum of ages of all persons whose names have an even number of characters.
        int sumOfAgesEvenLengthNames = persons.stream()
                .filter(person -> person.getName().length() % 2 == 0)
                .mapToInt(Person::getAge)
                .sum();
        System.out.println("Sum of ages of persons with even-length names: " + sumOfAgesEvenLengthNames);


    }

    private static boolean isPrime(Integer num) {
        if(num<=1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
