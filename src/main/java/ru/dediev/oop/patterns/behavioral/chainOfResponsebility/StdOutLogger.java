package ru.dediev.oop.patterns.behavioral.chainOfResponsebility;

public class StdOutLogger extends Logger{
    public StdOutLogger(int mask) {
        this.mask = mask;
    }

    @Override
    public void writeMessage(String msg) {
        System.out.println("Writing to stdout: " + msg);
    }
}
