package ru.dediev.oop.patterns.structural.decorator;

public class ConcernDecorator implements Concern{
    Concern concern;

    public ConcernDecorator(Concern concern) {
        this.concern = concern;
    }

    @Override
    public String makeCar() {
        return concern.makeCar();
    }
}
