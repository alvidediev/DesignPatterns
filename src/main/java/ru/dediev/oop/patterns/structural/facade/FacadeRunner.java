package ru.dediev.oop.patterns.structural.facade;

public class FacadeRunner {
    public static void main(String[] args) {
        CarMaker carMaker = new CarMaker();
        carMaker.buildCar();
    }
}
