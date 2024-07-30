package com.practice.test.java8concept;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestJava8Concept {
    public static void main(String[] args) {
        Map<Integer, String> idNameMap = new HashMap<Integer, String>();
        //Insert Id-Name pairs into idNameMap
        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");

        //Java 8 sorting using Entry.comparingByValue()

/*        Map<Integer, String> sortedMapByValue = idNameMap.entrySet().stream().sorted(Entry.comparingByValue()).
                collect(Collectors.toMap(Entry::getValue, Entry::getKey,(e1, e2)->e1, LinkedHashMap::new));
        System.out.println("sortedMapByValue====>"+sortedMapByValue);*/

        List<Employee> empLst = Arrays.asList(new Employee("Emp1",800,"IT"),new Employee("Emp2",1200,"CS"),
                new Employee("Emp3",800,"IT")
                ,new Employee("Emp5",1500,"CS"));
        // Get the max salary employee
        Optional<Employee> collect = empLst.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));
        collect.ifPresent(e-> System.out.println(e));
        ///=== OR ===
        Optional<Employee> first = empLst.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).findFirst();
        first.ifPresent(e-> System.out.println(e));

        /// ===== OR =======
        Optional<Employee> max = empLst.stream().max(Comparator.comparingInt(Employee::getSalary));
        max.ifPresent(ele-> System.out.println(ele));



        System.out.println("==========================================================================");

        // Get the department max salary but notice here we need to use Optional::get
        Map<String, Employee> departMaxSalEmp = empLst.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)));
        System.out.println(departMaxSalEmp);

        Map<String, Employee> collect7 = empLst.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)));
        System.out.println("collect7===>"+collect7);

        // Here implemented the hashcode and equal method on Employee "name" field so it display on the basis of name
        Map<String, Set<Employee>> collect1 = empLst.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toSet()));
        TreeMap<String, Set<Employee>> collect2 = empLst.stream().collect(Collectors.groupingBy(Employee::getDept, TreeMap::new, Collectors.toSet()));
        HashMap<String, Set<Employee>> collect3 = empLst.stream().collect(Collectors.groupingBy(Employee::getDept, HashMap::new, Collectors.toSet()));
        LinkedHashMap<String, Set<Employee>> collect4 = empLst.stream().collect(Collectors.groupingBy(Employee::getDept, LinkedHashMap::new, Collectors.toSet()));


        System.out.println("collect1==>"+collect1);
        System.out.println("collect2==>"+collect2);
        System.out.println("collect3==>"+collect3);
        System.out.println("collect4==>"+collect4);


        System.out.println("===================================");

        Map<Employee, Long> collect5 = empLst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> collect6 = empLst.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println("collect5==>"+collect5);
        System.out.println("collect6==>"+collect6);

    }
}
