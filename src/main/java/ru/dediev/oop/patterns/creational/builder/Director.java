package ru.dediev.oop.patterns.creational.builder;

//AKA Investor :)
public class Director {
    DealerBuilder dealerBuilder;

    public void setDealerBuilder(DealerBuilder dealerBuilder) {
        this.dealerBuilder = dealerBuilder;
    }

    Dealer buildDealer(){
        dealerBuilder.createDealer();
        dealerBuilder.buildName();
        dealerBuilder.dealerName();
        dealerBuilder.dealerCountry();
        dealerBuilder.buildDealerCategory();

        return dealerBuilder.getDealer();
    }
}
