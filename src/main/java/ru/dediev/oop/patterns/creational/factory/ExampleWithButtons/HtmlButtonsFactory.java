package ru.dediev.oop.patterns.creational.factory.ExampleWithButtons;


public class HtmlButtonsFactory implements ButtonsFactory {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
