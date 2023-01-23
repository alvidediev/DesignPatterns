package ru.dediev.oop.patterns.creational.abstractFactory.kiaDealerCentre;

import ru.dediev.oop.patterns.creational.abstractFactory.Rop;

public class KiaRop implements Rop {
    @Override
    public void letThemWork() {
        System.out.println("РОП КТА говорит: работайте! Иначе не будет премии! >:)");
    }
}
