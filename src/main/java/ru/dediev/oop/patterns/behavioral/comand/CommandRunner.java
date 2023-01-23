package ru.dediev.oop.patterns.behavioral.comand;

public class CommandRunner {
    public static void main(String[] args) {
        Light light = new Light();

        Command switchUp = light::turnOff;
        Command switchDown = light::turnOn;

        SwitchLight switchLight = new SwitchLight(switchUp, switchDown);

        switchLight.flipUp();
        switchLight.flipDown();
    }
}
