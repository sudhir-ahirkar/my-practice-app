package com.practice.test.concept.comparotorOrComparable;

import java.io.Serializable;

/**
 * Created by sudhir.ahirkar on 12/31/2017.
 */
public class Employee implements Serializable, Comparable<Employee>{


    private int id;

    private String name;

    private String department;

    private Integer age;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();

        return getName().hashCode()+id;
    }


    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee employee=(Employee) obj;
        if(getId()==employee.getId() & getName().equals(employee.getName()))
            return true;
        else
            return  false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
//        return o.id- this.id;//Dscending order by id

//        return this.id-o.id;//Ascending order by id



//        return  this.name.compareTo(o.name); //Ascending order by name
        //if age same then sort on the basis of same
        if(this.age.compareTo(o.age)==0)
          return this.name.compareTo(o.name);
          return this.age.compareTo(o.age); //Ascending order by Age
    }

   /* @Override
    public int compareTo(Object o) {
        return 0;
    }*/
}
