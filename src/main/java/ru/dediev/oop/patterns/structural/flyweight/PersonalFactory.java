package ru.dediev.oop.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PersonalFactory {
    private final Map<String, LadaDealer> dealerPersonal = new HashMap<>();

    public LadaDealer getEmployeeFromDealerMap(String specialty) {
        LadaDealer employee = dealerPersonal.get(specialty);

        if (employee == null) {
            switch (specialty) {
                case "rop":
                    System.out.println("Нанимаем руководителя отдела продаж");
                    employee = new Rop();
                    break;
                case "seller":
                    System.out.println("Продаю товар");
                    employee = new Seller();
                    break;
                case "marketer":
                    System.out.println("Нанимаем маркетолога");
                    employee = new Marketer();
            }
            dealerPersonal.put(specialty, employee);
        }
        return employee;
    }
}
