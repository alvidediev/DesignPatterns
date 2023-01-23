package ru.dediev.oop.patterns.behavioral.chainOfResponsebility;

public class StdErrLogger extends Logger {
    public StdErrLogger(int mask) {
        this.mask = mask;
    }

    public void writeMessage(String msg) {
        System.out.println("Sending to stderr: " + msg);
    }
}
