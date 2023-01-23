package ru.dediev.oop.patterns.creational.abstractFactory.ladaDealerCentre;

import ru.dediev.oop.patterns.creational.abstractFactory.SuperTehnichka;

public class LadaTehnichka implements SuperTehnichka {
    @Override
    public void kill() {
        System.out.println("Техничка из ЛАДА не говорит, а делает дело: Ты шел по вымытому полу ? *Звуки выстрелов*");
    }
}
