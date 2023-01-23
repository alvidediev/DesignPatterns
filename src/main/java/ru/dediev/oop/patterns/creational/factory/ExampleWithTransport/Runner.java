package ru.dediev.oop.patterns.creational.factory.ExampleWithTransport;

public class Runner {
    public static void main(String[] args) {

        TransportFactory airplane = chooser(TransportType.CAR);

        Transport transport = airplane.createTransport();

        transport.logistic();
    }

    static TransportFactory chooser(TransportType type) {
        switch (type) {
            case CAR:
                return new CarFactory();
            case SHIP:
                return new ShipFactory();
            case AIRPLANE:
                return new AirplaneFactory();
            default:
                throw new RuntimeException("Неизвестный формат данных");
        }
    }
}
