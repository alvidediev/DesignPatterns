package ru.dediev.oop.patterns.creational.abstractFactory;

import ru.dediev.oop.patterns.creational.abstractFactory.kiaDealerCentre.KiaTeamFactory;

public class KiaDealer{
    public static void main(String[] args) {
        TeamFactory kiaTeamFactory = new KiaTeamFactory();

        Director director = kiaTeamFactory.getDirector();
        Rop rop = kiaTeamFactory.getRop();
        Seller seller = kiaTeamFactory.getSeller();
        SuperTehnichka superTehnichka = kiaTeamFactory.getSuperTehnichka();

        System.out.println("Создаем ДЦ КИА!");

        director.doWork();
        rop.letThemWork();
        seller.doYouWannaBuyCar();
        superTehnichka.kill();
    }
}
