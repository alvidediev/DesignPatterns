package ru.dediev.oop.patterns.structural.decorator;

public class SpareParts extends ConcernDecorator{
    public SpareParts(Concern concern) {
        super(concern);
    }

    private String spareParts(){
        return " + spare parts";
    }

    @Override
    public String makeCar() {
        return super.makeCar() + spareParts();
    }
}
