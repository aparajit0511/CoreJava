package EmployeeClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee("ajay",10000);
        Employee employee2 = new Employee("vijay",51000);
        Employee employee3 = new Employee("adam",52000);
        Employee employee4 = new Employee("eve",100000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        List<String> result = employeeList.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("Names using stream " + result);

        List <String> names = new ArrayList<>();

        for(Employee employee:employeeList){
            if(employee.getSalary() > 50000){
                names.add(employee.getName());
            }
        }

        System.out.println("NAmes " + names);
    }
}

class Employee{
    private String name;
    private int salary;

    public Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}