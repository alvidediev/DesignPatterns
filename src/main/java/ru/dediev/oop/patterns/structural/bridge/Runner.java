package ru.dediev.oop.patterns.structural.bridge;

import ru.dediev.oop.patterns.structural.bridge.device.Device;
import ru.dediev.oop.patterns.structural.bridge.device.Radio;
import ru.dediev.oop.patterns.structural.bridge.device.Tv;
import ru.dediev.oop.patterns.structural.bridge.remote.AdvancedRemote;
import ru.dediev.oop.patterns.structural.bridge.remote.BasicRemote;

public class Runner {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.channelUp();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
