package ru.dediev.oop.patterns.structural.decorator;

public class Runner {
    public static void main(String[] args) {
        Concern concern = new Engine(new SpareParts(new Tire(new LadaConcern())));

        System.out.println(concern.makeCar());
    }
}
