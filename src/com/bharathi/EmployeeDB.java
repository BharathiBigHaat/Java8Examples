package com.bharathi;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {

    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Bharathi","IT", "9900887700", 40000d));
        employees.add(new Employee(10,"Saketh","Digital Marketing", "333333333", 50000d));
        employees.add(new Employee(11,"Balaji","IT", "555555555", 40000d));
        employees.add(new Employee(9,"Prasad","Account", "66666666", 80000d));
        employees.add(new Employee(1,"Sai","Sales", "7777777777", 40000d));
        return employees;

    }
}
