package com.practice.test.java8concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Sudhir", 32, Arrays.asList("897454", "587874", "9765489")),
                new User("Sagar", 35, Arrays.asList("3665454", "587", "9789")),
                new User("Roshan", 30, Arrays.asList("54", "58741", "9789")),
                new User("Rajesh", 38, Arrays.asList("895454", "78916587", "9754489"))
        );
        //get the list of phones, here need to use map
        List<String> Lst = users.stream().map(user -> user.getPhones()).flatMap(phones -> phones.stream()).collect(Collectors.toList());
        System.out.println("Lst====>"+Lst);
    }
}