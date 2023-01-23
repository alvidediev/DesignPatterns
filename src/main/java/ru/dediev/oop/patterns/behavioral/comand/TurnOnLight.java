package ru.dediev.oop.patterns.behavioral.comand;

public class TurnOnLight implements Command {
    private Light theLight;

    public TurnOnLight(Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOn();
    }
}
