package ru.dediev.oop.patterns.structural.proxy;

public class SynchronizedConnectionProxy implements DbConnection {

    private SynchronizedConnection synchronizedConnection;

    @Override
    public void connect() {
        if (synchronizedConnection == null) {
            synchronizedConnection = new SynchronizedConnection();
        }
        synchronizedConnection.connect();
    }
}
