package ru.dediev.oop.patterns.structural.flyweight;

public class Marketer implements LadaDealer {
    @Override
    public void work() {
        System.out.println("Делаю рекламу...");
    }
}
