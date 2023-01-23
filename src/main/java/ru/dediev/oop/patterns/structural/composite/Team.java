package ru.dediev.oop.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Employee{
    private List<Employee> employees = new ArrayList<>();

    public void addEmployees(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    @Override
    public void doWork() {
        System.out.println("Команда Дилерского центра делает работу");
        for (Employee employee : employees) {
            employee.doWork();
        }
    }
}
