package ru.dediev.oop.patterns.creational.abstractFactory.kiaDealerCentre;

import ru.dediev.oop.patterns.creational.abstractFactory.*;

public class KiaTeamFactory implements TeamFactory {
    @Override
    public Director getDirector() {
        return new KiaDealerDirector();
    }

    @Override
    public Seller getSeller() {
        return new KiaSeller();
    }

    @Override
    public Rop getRop() {
        return new KiaRop();
    }

    @Override
    public SuperTehnichka getSuperTehnichka() {
        return new KiaTehnichka();
    }
}
