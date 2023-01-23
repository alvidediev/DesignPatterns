package ru.dediev.oop.patterns.structural.bridge.remote;

import ru.dediev.oop.patterns.structural.bridge.device.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
