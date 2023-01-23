package ru.dediev.oop.patterns.creational.abstractFactory.ladaDealerCentre;

import ru.dediev.oop.patterns.creational.abstractFactory.Seller;

public class LadaSeller implements Seller {
    @Override
    public void doYouWannaBuyCar() {
        System.out.println("Продавец ЛАДА говорит: Купите пазязя :3 (лицо милее чем у КИА)");
    }
}
