package com.practice.test.coding_test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingSkill {


/*    *
    *
    * Employee e1 = new Employee("Sravan", 23, "Hyderabad", 7, "Delivery");
    *        Employee e2 = new Employee("Vishwas", 145, "Bangalore", 20, "Production");
    *        Employee e3 = new Employee("Suvit", 67, "Pune", 12, "Core");
    *         Employee e4 = new Employee("Dhiraj", 5236, "Pune", 15, "Core");
    *         Employee e5 = new Employee("Anshu", 74545, "Pune", 9, "Delivery");
    *         Employee e6 = new Employee("Pulkit", 15556, "Bangalore", 14, "Delivery");
    *         Employee e7 = new Employee("Anuradha", 7852, "Pune", 14, "Production");
    *         Employee e8 = new Employee("Srikrishna", 6712, "Hyderabad", 11, "Production");
    *         Employee e9 = new Employee("Vidya", 2147, "Bangalore", 5, "Core");
    *         Employee e10 = new Employee("Kunal", 12365, "Bangalore", 8, "Production");
    *         Employee e11 = new Employee("Prashant", 2547, "Hyderabad", 6, "Production");
    *         Employee e12 = new Employee("Walter", 62112, "Hyderabad", 10, "Delivery");
    *         List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
    *
    *
    * */

    public static void main(String[] args) {

           Employee e1 = new Employee("Sravan", 23, "Hyderabad", 7, "Delivery");
           Employee e2 = new Employee("Vishwas", 145, "Bangalore", 20, "Production");
             Employee e3 = new Employee("Suvit", 67, "Pune", 12, "Core");
             Employee e4 = new Employee("Dhiraj", 5236, "Pune", 15, "Core");
             Employee e5 = new Employee("Anshu", 74545, "Pune", 9, "Delivery");         Employee e6 = new Employee("Pulkit", 15556, "Bangalore", 14, "Delivery");
        Employee e7 = new Employee("Anuradha", 7852, "Pune", 14, "Production");
             Employee e8 = new Employee("Srikrishna", 6712, "Hyderabad", 11, "Production");
           Employee e9 = new Employee("Vidya", 2147, "Bangalore", 5, "Core");
             Employee e10 = new Employee("Kunal", 12365, "Bangalore", 8, "Production");
             Employee e11 = new Employee("Prashant", 2547, "Hyderabad", 6, "Production");
             Employee e12 = new Employee("Walter", 62112, "Hyderabad", 10, "Delivery");
             List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);

        Map<String, List<Employee>> cityWithEmpLst = empList.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.toList()));
        System.out.println("cityWithEmpLst===>"+cityWithEmpLst);

        Map<String, Long> cityWithEmpCount = empList.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
        System.out.println("cityWithEmpCount===>"+cityWithEmpCount);


        MyFunctionalInterface myFunctionalInterface = ()-> System.out.println("My first Functional Interface");

        myFunctionalInterface.myfunction();



    }


}

