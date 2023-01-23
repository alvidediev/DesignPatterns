package ru.dediev.oop.patterns.behavioral.chainOfResponsebility;

public abstract class Logger {
    public final static int ERR = 3;
    public final static int NOTICE = 5;
    public final static int DEBUG = 7;
    public int mask;

    private Logger next;

    public Logger setNext(Logger log) {
        next = log;
        return log;
    }

    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }
        if (next != null) {
            next.message(msg, priority);
        }
    }

    public abstract void writeMessage(String msg);
}
