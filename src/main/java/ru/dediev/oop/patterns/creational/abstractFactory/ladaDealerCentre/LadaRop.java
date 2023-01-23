package ru.dediev.oop.patterns.creational.abstractFactory.ladaDealerCentre;

import ru.dediev.oop.patterns.creational.abstractFactory.Rop;

public class LadaRop implements Rop {
    @Override
    public void letThemWork() {
        System.out.println("РОП ЛАДА говорит: А продадим-ка дешевле чем у КИА ? >:)");
    }
}
