package ru.dediev.oop.patterns.creational.singleton;

public class Singleton {
    private static volatile Singleton instance;

    public String getConnection;

    private Singleton(String connectionPath){
        this.getConnection = connectionPath;
    }

    public static Singleton getInstance(String connectionPath){
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(connectionPath);
            }

            return instance;
        }
    }

    @Override
    public String toString() {
        return "The hashcode of our Singleton: " + hashCode();
    }
}
