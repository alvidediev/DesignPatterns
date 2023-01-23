package ru.dediev.oop.patterns.creational.factory.ExampleWithTransport;

public class CarFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
