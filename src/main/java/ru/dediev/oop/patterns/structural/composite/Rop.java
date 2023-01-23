package ru.dediev.oop.patterns.structural.composite;

public class Rop implements Employee {
    @Override
    public void doWork() {
        System.out.println("Руководитель отдела продаж управляет отделом");
    }
}
