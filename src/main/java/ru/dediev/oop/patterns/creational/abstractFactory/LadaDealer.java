package ru.dediev.oop.patterns.creational.abstractFactory;

import ru.dediev.oop.patterns.creational.abstractFactory.ladaDealerCentre.LadaTeamFactory;

public class LadaDealer {
    public static void main(String[] args) {
        TeamFactory ladaTeamFactory = new LadaTeamFactory();

        Director director = ladaTeamFactory.getDirector();
        Rop rop = ladaTeamFactory.getRop();
        Seller seller = ladaTeamFactory.getSeller();
        SuperTehnichka superTehnichka = ladaTeamFactory.getSuperTehnichka();

        System.out.println("Строим ДЦ!");

        director.doWork();
        rop.letThemWork();
        seller.doYouWannaBuyCar();
        superTehnichka.kill();
    }
}
