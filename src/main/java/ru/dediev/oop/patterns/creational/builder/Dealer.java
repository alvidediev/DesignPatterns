package ru.dediev.oop.patterns.creational.builder;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Dealer {
    private String name;
    private DealerNames dealerNames;
    private Country country;
    private int employees;
    private DealerCategory dealerCategory;
}
