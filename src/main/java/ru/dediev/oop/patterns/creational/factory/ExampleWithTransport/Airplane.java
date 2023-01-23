package ru.dediev.oop.patterns.creational.factory.ExampleWithTransport;

public class Airplane implements Transport {
    @Override
    public void logistic() {
        System.out.println("Aeroplane logistic");
    }
}
