package com.practice.test.java8concept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMapExample2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<User> users = Arrays.asList(
                new User("Sudhir", 32, Arrays.asList("897454", "587874", "9765489")),
                new User("Sagar", 35, Arrays.asList("3665454", "587", "9789")),
                new User("Roshan", 30, Arrays.asList("54", "58741", "9789")),
                new User("Rajesh", 38, Arrays.asList("895454", "78916587", "9754489"))
        );
        // Find the oldest User in the list
        User OldestUser = users.stream().sorted(Comparator.comparingInt(User::getAge).reversed()).findFirst().get();
        System.out.println("OldestUser======>"+OldestUser);

        // Youngest User in the list
        User youngestUser = users.stream().sorted(Comparator.comparingInt(User::getAge)).findFirst().get();
        System.out.println("youngestUser======>"+youngestUser);

        System.out.println("Process Functional Style==>");

        Optional<String> pho = users.stream()
                .map(user -> user.getPhones())
                .flatMap(phones -> phones.stream()).filter(phone -> phone.equals("587"))
                .findAny();

        String s = users.stream()
                .map(user -> user.getPhones().stream())
//              .flatMap(stringStream -> stringStream.fi)
                .flatMap(stream -> stream.filter(phone -> phone.equals("587")))
                .findAny().orElseThrow(() -> new RuntimeException("Tested Error"));
        System.out.println("s==>" + s);

        users.stream()
                .map(user -> user.getPhones().stream())
                .flatMap(stream -> stream.filter(phone -> phone.equals("587")))
                .findAny();

        List<String> phos = users.stream()
                .map(user -> user.getPhones()).flatMap(e -> e.stream()).filter(phone -> phone.equals("587")).collect(Collectors.toList());
        phos.forEach(System.out::println);

        pho.ifPresent(System.out::println);
    }
}
