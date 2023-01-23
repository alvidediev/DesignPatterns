package ru.dediev.oop.patterns.creational.abstractFactory.kiaDealerCentre;

import ru.dediev.oop.patterns.creational.abstractFactory.SuperTehnichka;

public class KiaTehnichka implements SuperTehnichka {
    @Override
    public void kill() {
        System.out.println("Техничка из КИА говорит: " +
                "Я не спрашиваю сколько людей ходили по вымытому полу, я спрашиваю где они???");
    }
}
