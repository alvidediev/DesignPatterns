package ru.dediev.oop.patterns.behavioral.mediator;

public class User implements Users{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    @Override
    public void sendMessage(String message){
        Chat.showMessage(this,message);
    }
}
