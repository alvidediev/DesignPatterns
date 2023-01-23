package ru.dediev.oop.patterns.structural.decorator;

public class Engine extends ConcernDecorator{
    public Engine(Concern concern) {
        super(concern);
    }

    private String engine(){
        return " + engine = car!";
    }

    @Override
    public String makeCar() {
        return super.makeCar() + engine();
    }
}
