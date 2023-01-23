package ru.dediev.oop.patterns.creational.factory.ExampleWithButtons;


public interface ButtonsFactory {

    default void renderWindow() {
        Button button = createButton();
        button.render();
    }

    Button createButton();

}
