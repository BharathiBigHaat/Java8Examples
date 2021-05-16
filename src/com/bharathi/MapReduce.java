package com.bharathi;

import java.util.*;

public class MapReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23,10,29,30,40,60);
        int sum1 = numbers.stream().mapToInt(value -> value ).sum();
        System.out.println(sum1);

        Optional<Integer> sum2 = numbers.stream().reduce(Integer::sum);
        System.out.println(sum2.get());

        List<Employee> employees = EmployeeDB.getEmployees();
        OptionalDouble maxSal = employees.stream().mapToDouble(emp ->emp.getSalary()).max();
        System.out.println(maxSal.getAsDouble());




    }
}
