package ru.dediev.oop.patterns.structural.facade;

import lombok.Setter;

@Setter
public class Engine implements Sparkle{
    private String engine;

    public void installEngineToCar(){
        System.out.println("Installing engine with power " + engine);
    }

    @Override
    public void doSparkle() {
        System.out.println("Team make engine " + engine);
    }
}
