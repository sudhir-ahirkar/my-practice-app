package com.practice.test.java8concept.tri;

import java.util.Map;
import java.util.Optional;

/*
*
* Find the employeeId of "Charlie" from a map using Java Streams Api.
   Map<Long, String> employees = Map.of(
           123L, "Alice",
            124L, "Bob",
           125L, "Charlie"
   );
*
* */
public class GetIdFrmMapOnBasisKey {
    public static void main(String[] args) {
        Map<Long, String> employees = Map.of(
                123L, "Alice",
                124L, "Bob",
                125L, "Charlie"
        );

        Long charlieAssId = employees.entrySet().stream().filter(entry -> entry.getValue().equals("Charlie"))
                .map(Map.Entry::getKey).findFirst().get();
        System.out.println("charlieAssId===>" + charlieAssId);

    }
}
