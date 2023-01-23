package ru.dediev.oop.patterns.creational.abstractFactory.kiaDealerCentre;

import ru.dediev.oop.patterns.creational.abstractFactory.Seller;

public class KiaSeller implements Seller {
    @Override
    public void doYouWannaBuyCar() {
        System.out.println("Продавец КИА говорит: Купите KIA, пазязя :3");
    }
}
