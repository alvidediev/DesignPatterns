package ru.dediev.oop.patterns.behavioral.mediator;

public class MediatorRunner {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        System.out.println("This is mediator example. Mediator creates timestamp to chat");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
