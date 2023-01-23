package ru.dediev.oop.patterns.creational.factory.ExampleWithButtons;

/**
 * На экран выводится подобие кнопки на языке разметки :)
 */

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button> Test btn </button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Изучаем паттерны! Это фабричный метод!");
    }
}
