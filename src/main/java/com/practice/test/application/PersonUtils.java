/*

package com.practice.test.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PersonUtils {
  public static void main(String[] args) {

    

    List<Person> persons = new ArrayList<>();

   

    persons.add(new Person("Marlon", "Brando", 80, "USA"));

    persons.add(new Person("Bruce", "Lee", 32, "China"));

    persons.add(new Person("Brandon", "Lee", 28, "China"));

    String[] sortBy1 = { "firstName" };

    sortPersons(persons, sortBy1);

    System.out.println(persons);

    System.out.println("\n\n\n\n");

    persons.add(new Person("Amjad", "Khan", 51, "India"));

    persons.add(new Person("Amrish", "Puri", 72, "India"));

    persons.add(new Person("Sanjeev", "Kumar", 47, "India"));

    String[] sortBy2 = { "country", "firstName" };

    sortPersons(persons, sortBy2);

    System.out.println(persons);



}



public static void sortPersons(Lifst<Person> person, String[] sortBy) {

    Comparator<Person> comp = null;

    for (String field : sortBy)

           comp = updateComparator(comp, field);

    Collections.sort(person, comp);

}



public static Comparator<Person> updateComparator(Comparator<Person> comp, String field) {

    if ("firstName".equals(field)) {

           comp = comp == null ? Comparator.comparing(Person::getFirstName) : comp.thenComparing(Person::getFirstName);

    } else if ("lastName".equals(field)) {

           comp = comp == null ? Comparator.comparing(Person::getLastName) : comp.thenComparing(Person::getLastName);

    } else if ("age".equals(field)) {

           comp = comp == null ? Comparator.comparing(Person::getAge) : comp.thenComparing(Person::getAge);

    } else if ("country".equals(field)) {

           comp = comp == null ? Comparator.comparing(Person::getCountry) : comp.thenComparing(Person::getCountry);

    }

    return comp;

}


}

*/
