package ru.dediev.oop.patterns.structural.proxy;

public class ProxyRunner {
    public static void main(String[] args) {
        DbConnection dbConnection = new SynchronizedConnectionProxy();

        dbConnection.connect();
    }
}
