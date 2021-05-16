package com.bharathi;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    List<String> names = Arrays.asList("saketh","bharathi","balaji","sai","prasad");
	    names.stream().filter(name->name.startsWith("s")).forEach(System.out::println);
        List<String> sortedNames=names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedNames.forEach(System.out::println);

        Map<String,Integer> map = new HashMap<>();
        map.put("Bharathi",38);
        map.put("Balaji",13);
        map.put("Saketh",13);
        map.put("Prasad",44);
        map.put("Sai",44);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("*********************");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("*********************");

        Map<Employee,Integer> employees = new HashMap<>();
        employees.put(new Employee(1,"Bharathi","IT", "9900887700", 40000d),2);
        employees.put(new Employee(10,"Saketh","Digital Marketing", "9900887700", 40000d),1);
        employees.put(new Employee(22,"Bala","Infra", "9900887700", 40000d),3);
        employees.put(new Employee(6,"Saketh","IT", "9900887700", 40000d),6);
        employees.put(new Employee(190,"Prasad","IT", "9900887700", 40000d),9);


        employees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId))).forEach(System.out::println);


    }
}
