package ru.dediev.oop.patterns.structural.decorator;

public class Tire extends ConcernDecorator {

    public Tire(Concern concern) {
        super(concern);
    }

    public String tires(){
        return "tires";
    }

    @Override
    public String makeCar() {
        return super.makeCar() + tires();
    }
}
