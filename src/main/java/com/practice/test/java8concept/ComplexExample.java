package com.practice.test.java8concept;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ComplexExample {
    public static void main(String[] args) {
        Bugs bugs = new Bugs("db",1000,true,"description1");
        Bugs bugs1 = new Bugs("backend",1007,true,"description1");
        Bugs bugs2 = new Bugs("frontend",1003,true,"description1");
        Bugs bugs3 = new Bugs("backend",1005,false,"description1");
        Bugs bugs4 = new Bugs("db",1000,true,"description1");
        Bugs bugs5 = new Bugs("frontend",1007,true,"description1");
        Bugs bugs6 = new Bugs("java",1003,false,"description1");
        Bugs bugs7 = new Bugs("db",1008,true,"description1");
        Bugs bugs8 = new Bugs("backend",1007,false,"description1");

        List<Bugs> lst = new ArrayList<>();
        lst.add(bugs1);
        lst.add(bugs);
        lst.add(bugs2);
        lst.add(bugs3);
        lst.add(bugs4);
        lst.add(bugs5);
        lst.add(bugs6);
        lst.add(bugs7);
        lst.add(bugs8);


//        Map<Double, List<Optional<Map<String,Long>>>> collect = lst.stream().collect(Collectors.groupingBy(Bugs::getSalary,
//                Collectors.collectingAndThen(Collectors.groupingBy(Bugs::getError, Collectors.counting()))));
//
//        R collect1 = lst.stream().collect(Collectors.groupingBy(Bugs::getSalary,
//                Collectors.groupingBy(Bugs::getError, Collectors.toMap(Bugs::getError, Collectors.toList()))));


        Map<String, Long> collect = lst.stream().collect(Collectors.groupingBy(Bugs::getError, Collectors.counting()));


        Map<Double, Map<String, Long>> collect0 = lst.stream().collect(Collectors.groupingBy(Bugs::getSalary,
                Collectors.groupingBy(Bugs::getError,
                        Collectors.mapping(Bugs::getError, Collectors.counting()))));
        System.out.println("collect0====>"+collect0);

        Map<Double, Map<String, List<String>>> collect2 = lst.stream()
                .collect(Collectors.groupingBy(
                        Bugs::getSalary,
                        Collectors.groupingBy(
                                Bugs::getError,
                                Collectors.mapping(
                                        Bugs::getError,
                                        Collectors.toList()
                                )
                        )
                ));

        System.out.println("collect2===>"+collect2);


        Map<Double, Map<String, Long>> collect3 = lst.stream()
                .collect(Collectors.groupingBy(
                        Bugs::getSalary,
                        Collectors.groupingBy(
                                Bugs::getError,
                                Collectors.mapping(
                                        Bugs::getError,
                                        Collectors.counting()
                                )
                        )
                ));

        System.out.println("collect3===>"+collect3);


        Map<Double, Map<String, List<String>>> collect1 = lst.stream().collect(Collectors.groupingBy(Bugs::getSalary,
                Collectors.groupingBy(Bugs::getError, Collectors.mapping(Bugs::getError, Collectors.toList()))));
        System.out.println("collect1=====>"+collect1);

    }

}

class Bugs {

    private String error;
    private double salary;
    private boolean status;
    private String description;

    public Bugs(String error, double salary, boolean status, String description) {
        this.error = error;
        this.salary = salary;
        this.status = status;
        this.description = description;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
