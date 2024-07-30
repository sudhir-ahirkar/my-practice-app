package com.practice.test.concept.comparotorOrComparable;

import java.util.*;

/**
 * Created by sudhir.ahirkar on 12/11/2017.
 */
public class Test {

    public static void main(String[] args) {

        Employee employee=new Employee();

        employee.setAge(29);
        employee.setDepartment("Software Engineer");
        employee.setName("Sudhir");
        employee.setId(1);

        Employee employee1=new Employee();

        employee1.setAge(29);
        employee1.setDepartment("Sr. Software Engineer");
        employee1.setName("Roshan");
        employee1.setId(3);


        Employee employee2=new Employee();

        employee2.setAge(35);
        employee2.setDepartment("Manager Engineer");
        employee2.setName("Rahul");
        employee2.setId(2);

        List<Employee> employees=new ArrayList<>();

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        //to use collection sort first we should implements comparable interface
        Collections.sort(employees);
        // if you want to reverse then we can use following
//         Collections.sort(employees, Comparator.reverseOrder());
        System.out.println("employees=======>"+employees);


        ///use Comparator for custom sorting and can apply sorting on multiple fields

        List<Employee> employeeUsinComparoats=new ArrayList<Employee>();

        employeeUsinComparoats.add(employee);
        employeeUsinComparoats.add(employee1);
        employeeUsinComparoats.add(employee2);
        //to use collection sort first we should implements comparable interface
        Collections.sort(employees);
        // if you want to reverse then we can use following
        Collections.sort(employees, Comparator.reverseOrder());
//        Collections.sort(employees, Collections.reverseOrder());

        Collections.sort(employeeUsinComparoats,new MyComparatorOnName());
        System.out.println("employeeUsinComparoats=======>"+employeeUsinComparoats);
        Collections.sort(employeeUsinComparoats,new MycompatorOnAge());
        System.out.println("employeeUsinComparoats=======>"+employeeUsinComparoats);
    }
}
