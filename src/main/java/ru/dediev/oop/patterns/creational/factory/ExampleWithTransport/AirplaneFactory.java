package ru.dediev.oop.patterns.creational.factory.ExampleWithTransport;

public class AirplaneFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
