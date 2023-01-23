package ru.dediev.oop.patterns.structural.composite;

public class Marketer implements Employee{
    @Override
    public void doWork() {
        System.out.println("Маркетолог делает рекламу");
    }
}
