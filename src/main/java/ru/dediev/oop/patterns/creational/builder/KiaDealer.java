package ru.dediev.oop.patterns.creational.builder;

public class KiaDealer extends DealerBuilder{
    @Override
    void buildName() {
        dealer.setName("KIA KASPIY");
    }

    @Override
    void setEmployees() {
        dealer.setEmployees(25);
    }

    @Override
    void dealerName() {
        dealer.setDealerNames(DealerNames.KIA);
    }

    @Override
    void dealerCountry() {
        dealer.setCountry(Country.OSETIYA);
    }

    @Override
    void buildDealerCategory() {
        dealer.setDealerCategory(DealerCategory.FIRST);
    }
}
