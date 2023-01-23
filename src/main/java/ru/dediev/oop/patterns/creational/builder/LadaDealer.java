package ru.dediev.oop.patterns.creational.builder;


public class LadaDealer extends DealerBuilder{
    @Override
    void buildName() {
        dealer.setName("TEREK-AUTO");
    }

    @Override
    void setEmployees() {
        dealer.setEmployees(31);
    }

    @Override
    void dealerName() {
        dealer.setDealerNames(DealerNames.LADA);
    }

    @Override
    void dealerCountry() {
        dealer.setCountry(Country.ARGUN);
    }


    @Override
    void buildDealerCategory() {
        dealer.setDealerCategory(DealerCategory.THIRD);
    }
}
