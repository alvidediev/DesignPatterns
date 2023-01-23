package ru.dediev.oop.patterns.creational.prototype;

public class Buyer {

    public static void main(String[] args) {
        Car car = new Car(31, "LADA", "21.04.2023");

        System.out.println(car);

        //бороздим океаны в 21 веке, хо-хо-хо!
        Car piratstvo = car.copy();

        System.out.println(piratstvo);
    }
}
