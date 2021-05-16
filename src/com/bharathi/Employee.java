package com.bharathi;

public class Employee {
    public Employee(Integer id, String name, String department, String mobileNumbers, Double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.mobileNumbers = mobileNumbers;
        this.Salary = salary;
    }

    private Integer id;
    private String name;
    private String department;
    private String mobileNumbers;
    private Double Salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public String getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(String mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}
