package ru.dediev.oop.patterns.creational.builder;

public class LadaDealerBuilderRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setDealerBuilder(new KiaDealer());

        Dealer ladaDealer = director.buildDealer();

        System.out.println(ladaDealer);
    }
}
