package ru.dediev.oop.patterns.structural.composite;

public class Seller implements Employee {
    @Override
    public void doWork() {
        System.out.println("Продавцы продают товар");
    }
}
