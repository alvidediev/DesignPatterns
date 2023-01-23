package ru.dediev.oop.patterns.creational.factory.ExampleWithTransport;

public class Ship implements Transport {
    @Override
    public void logistic() {
        System.out.println("Ship logistic's");
    }
}
