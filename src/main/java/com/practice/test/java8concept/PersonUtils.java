package com.practice.test.java8concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonUtils {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Marlon", "Brando", 80, "USA"));
        persons.add(new Person("Bruce", "Lee", 32, "China"));
        persons.add(new Person("Brandon", "Lee", 28, "China"));
        // String[] sortBy= {"firstName"};

        persons.add(new Person("Amjad", "Khan", 51, "India"));
        persons.add(new Person("Amrish", "Puri", 51, "China"));
        persons.add(new Person("Sanjeev", "Kumar", 47, "India"));
//        String[] sortBy = {"country", "firstName"};
//        String[] sortBy = {"country"};
        String[] sortBy = {"age","country"};



/*        List<Integer> as = Arrays.asList(1,5,8,9,4,5,8,3,8);
        Set<Integer> hs=new TreeSet(as);
        Collections.sort(hs);
        System.out.println(hs)*/;
//    Set<Person> s=new TreeSet<>(persons);




        List<Person> lst = sortPersons(persons, sortBy);
    System.out.println(lst);
    }


    public static List<Person> sortPersons(List<Person> person, String[] sortBy) {
        List<Person> lst = new ArrayList<>();
        for (int i = 0; i < sortBy.length; i++) {
            String s = sortBy[i];
            lst=lst.isEmpty()?person:lst;
            if (s.equals("firstName")) {
                lst =  lst.stream().sorted(Comparator.comparing(Person::getFirstName)).collect(Collectors.toList());
            } else if (s.equals("lastName")) {
                lst =lst.stream().sorted(Comparator.comparing(Person::getLastName)).collect(Collectors.toList());
            } else if (s.equals("age")) {
                lst =lst.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
            } else if (s.equals("country")) {
                lst = lst.stream().sorted(Comparator.comparing(Person::getCountry)).collect(Collectors.toList());
            }
/*            Comparator<Person> compareLst = null;

            Stream<Person> persons = null;

            String s = sortBy[i];

            Comparator<Person> sortByFirstName = (p, o) -> p.firstName.compareToIgnoreCase(o.firstName);

            Comparator<Person> sortByLastName = (p, o) -> p.lastName.compareToIgnoreCase(o.lastName);

            Comparator<Person> sortByAge = (p, o) -> Integer.compare(p.age, o.age);

//      Comparator<Person> sortByCountry = (p, o) -> String.compare(p.country, o.country);



            if (s.equals("firstName")) {
                persons = person.stream().sorted(sortByFirstName);

            } else if (s.equals("lastName")) {
                persons = person.stream().sorted(sortByLastName);

            } else if (s.equals("age")) {
                compareLst = compareLst.thenComparing(Person::getFirstName);

            } else if (s.equals("country")) {
                compareLst = compareLst.thenComparing(Person::getFirstName);

            }
            lst.forEach(System.out::println);
            System.out.println(lst);*/
        }
        return lst;
    }
}

