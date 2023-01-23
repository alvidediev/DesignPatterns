package ru.dediev.oop.patterns.behavioral.chainOfResponsebility;

public class EmailLogger extends Logger{
    public EmailLogger(int mask) {
        this.mask = mask;
    }

    public void writeMessage(String msg) {
        System.out.println("Sending via email: " + msg);
    }
}
