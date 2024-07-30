package com.practice.test.java8concept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GoodProblems {
    public static void main(String[] args) {
        List<PersonDetail> people = Arrays.asList(
                new PersonDetail("John", "New York", 25),
                new PersonDetail("Jane", "Los Angeles", 30),
                new PersonDetail("Mike", "New York", 35),
                new PersonDetail("Emily", "Chicago", 28),
                new PersonDetail("Dave", "Los Angeles", 40),
                new PersonDetail("John", "New York", 26)  // Adding a duplicate name with a different age
        );

        people.stream().
                collect(Collectors.groupingBy(PersonDetail::getCity
        ,Collectors.groupingBy(PersonDetail::getName,
                        Collectors.mapping(PersonDetail::getAge,Collectors.toList()))));



        Map<String, Map<String, List<Integer>>> peopleByCityAndName = people.stream()
                .collect(Collectors.groupingBy(
                        PersonDetail::getCity,
                        Collectors.groupingBy (
                                PersonDetail::getName,
                                Collectors.mapping(
                                        PersonDetail::getAge,
                                        Collectors.toList()
                                )
                        )
                ));
        System.out.println("peopleByCityAndName======>"+peopleByCityAndName);

        peopleByCityAndName.forEach((city, nameAgeMap) -> {
            System.out.println("People living in " + city + ":");
            nameAgeMap.forEach((name, ages) -> {
                System.out.println(" - " + name + ": " + ages);
            });
        });
    }
}

class PersonDetail {

    private String name;
    private String city;
    private int age;

    public PersonDetail(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " from " + city + " aged " + age;
    }
}
