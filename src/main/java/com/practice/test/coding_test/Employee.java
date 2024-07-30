package com.practice.test.coding_test;

public class Employee {

    private String empName;

    private int empId;

    private String city;

    private double baseSalaryInLakhs;

    private String department;

    public String getEmpName() {

        return empName;

    }

    public void setEmpName(String empName) {

        this.empName = empName;

    }

    public int getEmpId() {

        return empId;

    }

    public void setEmpId(int empId) {

        this.empId = empId;

    }

    public String getCity() {

        return city;

    }

    public void setCity(String city) {

        this.city = city;

    }

    public double getBaseSalaryInLakhs() {

        return baseSalaryInLakhs;

    }

    public Employee(String empName, int empId, String city, double baseSalaryInLakhs, String department) {

        super();

        this.empName = empName;

        this.empId = empId;

        this.city = city;

        this.baseSalaryInLakhs = baseSalaryInLakhs;

        this.department = department;

    }

    public void setBaseSalaryInLakhs(double baseSalaryInLakhs) {

        this.baseSalaryInLakhs = baseSalaryInLakhs;

    }

    public String getDepartment() {

        return department;

    }

    public void setDepartment(String department) {

        this.department = department;

    }

    @Override

    public String toString() {

        return "Employee [empName=" + empName + ", empId=" + empId + ", city=" + city + ", baseSalaryInLakhs="

                + baseSalaryInLakhs + ", department=" + department + "]";

    }
}
