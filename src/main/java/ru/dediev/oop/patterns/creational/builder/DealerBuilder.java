package ru.dediev.oop.patterns.creational.builder;

public abstract class DealerBuilder {
    Dealer dealer;

    void createDealer(){
        dealer = new Dealer();
    }

    abstract void buildName();
    abstract void dealerName();
    abstract void dealerCountry();
    abstract void setEmployees();
    abstract void buildDealerCategory();

    Dealer getDealer(){
        return dealer;
    }
}
