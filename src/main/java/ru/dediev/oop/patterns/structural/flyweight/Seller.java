package ru.dediev.oop.patterns.structural.flyweight;

public class Seller implements LadaDealer {
    @Override
    public void work() {
        System.out.println("Selling stuff");
    }
}
