package ru.dediev.oop.patterns.creational.factory.ExampleWithButtons;

public class WindowsButtonsFactory implements ButtonsFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
