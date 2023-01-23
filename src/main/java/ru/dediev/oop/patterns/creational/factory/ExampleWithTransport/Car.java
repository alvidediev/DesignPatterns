package ru.dediev.oop.patterns.creational.factory.ExampleWithTransport;

public class Car implements Transport {

    @Override
    public void logistic() {
        System.out.println("Car logistic's");
    }
}
