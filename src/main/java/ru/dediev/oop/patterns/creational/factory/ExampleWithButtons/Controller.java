package ru.dediev.oop.patterns.creational.factory.ExampleWithButtons;

import java.util.Scanner;

public class Controller {

    private static ButtonsFactory buttonsFactory;

    private void configure() {
        Scanner scanner = new Scanner(System.in);

        boolean stopper = true;

        while (stopper) {
            final String input = scanner.nextLine();
            if (input.equalsIgnoreCase("windows10")) {
                buttonsFactory = new WindowsButtonsFactory();
                stopper = false;
            } else if (input.equalsIgnoreCase("html")) {
                buttonsFactory = new HtmlButtonsFactory();
                stopper = false;
            } else {
                System.out.println("Введите корректные данные");
            }
        }
    }

    public void start() {
        configure();
        buttonsFactory.renderWindow();
    }
}
