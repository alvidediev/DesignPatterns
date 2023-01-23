package ru.dediev.oop.patterns.creational.abstractFactory;

public interface TeamFactory {
    Director getDirector();

    Seller getSeller();

    Rop getRop();

    SuperTehnichka getSuperTehnichka();
}
