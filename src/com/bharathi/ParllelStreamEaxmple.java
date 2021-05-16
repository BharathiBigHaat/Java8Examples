package com.bharathi;

import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class ParllelStreamEaxmple {
    public static void main(String[] args) {

        long start,end=0;
        start = System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end = System.currentTimeMillis();

        System.out.println("first:"+(end-start));
        start = System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();

        System.out.println("second:"+(end-start));

        List<Employee> employees = EmployeeDB.getEmployees();
        employees.parallelStream().map(emp ->emp.getName().toUpperCase(Locale.ROOT)).forEach(System.out::println);

    }
}
