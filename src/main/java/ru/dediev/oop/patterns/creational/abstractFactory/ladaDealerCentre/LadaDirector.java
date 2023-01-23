package ru.dediev.oop.patterns.creational.abstractFactory.ladaDealerCentre;

import ru.dediev.oop.patterns.creational.abstractFactory.Director;

public class LadaDirector implements Director {
    @Override
    public void doWork() {
        System.out.println("Директор ЛАДА говорит : В смысле продали всего 999 машин за этот месяц ?!");
    }
}
