package ru.dediev.oop.patterns.behavioral.comand;

public class TurnOffLight implements Command {
    private Light theLight;

    public TurnOffLight(Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOff();
    }
}
