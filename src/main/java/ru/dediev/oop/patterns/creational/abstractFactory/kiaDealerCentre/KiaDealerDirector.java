package ru.dediev.oop.patterns.creational.abstractFactory.kiaDealerCentre;

import ru.dediev.oop.patterns.creational.abstractFactory.Director;

public class KiaDealerDirector implements Director {
    @Override
    public void doWork() {
        System.out.println("Директор КИА говорит: Много денег не бывает! Продавайте дороже!");
    }
}
