package ru.dediev.oop.patterns.creational.abstractFactory.ladaDealerCentre;

import ru.dediev.oop.patterns.creational.abstractFactory.*;

public class LadaTeamFactory implements TeamFactory {
    @Override
    public Director getDirector() {
        return new LadaDirector();
    }

    @Override
    public Seller getSeller() {
        return new LadaSeller();
    }

    @Override
    public Rop getRop() {
        return new LadaRop();
    }

    @Override
    public SuperTehnichka getSuperTehnichka() {
        return new LadaTehnichka();
    }
}
