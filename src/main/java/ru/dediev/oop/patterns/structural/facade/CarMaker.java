package ru.dediev.oop.patterns.structural.facade;

public class CarMaker {
    public void buildCar(){
        System.out.println("Starting assemble car");
        Tire tire = new Tire();
        Engine engine = new Engine();
        tire.setTire(16);
        tire.doSparkle();
        tire.installToCarTire();
        engine.setEngine("V8");
        engine.doSparkle();
        engine.installEngineToCar();
        System.out.println("Finished assemble a car");
    }
}
