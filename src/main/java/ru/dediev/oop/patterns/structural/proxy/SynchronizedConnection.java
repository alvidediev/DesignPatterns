package ru.dediev.oop.patterns.structural.proxy;

public class SynchronizedConnection implements DbConnection {
    @Override
    public void connect() {
        System.out.println("Need at least 30 min's to get connection afters starting program......");
    }
}
