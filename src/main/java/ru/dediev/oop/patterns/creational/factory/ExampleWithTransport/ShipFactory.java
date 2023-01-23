package ru.dediev.oop.patterns.creational.factory.ExampleWithTransport;

public class ShipFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
