package ru.dediev.oop.patterns.structural.facade;

import lombok.Setter;

@Setter
public class Tire implements Sparkle {
    private int tire;

    public void installToCarTire() {
        System.out.println("Installing to car tire with diameter " + tire);
    }

    @Override
    public void doSparkle() {
        System.out.println("Make tire with diameter " + tire);
    }
}
