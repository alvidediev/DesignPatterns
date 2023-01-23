package ru.dediev.oop.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightRunner {
    public static void main(String[] args) {
        PersonalFactory personalFactory = new PersonalFactory();
        List<LadaDealer> listOfEmployees = new ArrayList<>();

        listOfEmployees.add(personalFactory.getEmployeeFromDealerMap("rop"));
        listOfEmployees.add(personalFactory.getEmployeeFromDealerMap("rop"));
        listOfEmployees.add(personalFactory.getEmployeeFromDealerMap("seller"));
        listOfEmployees.add(personalFactory.getEmployeeFromDealerMap("seller"));
        listOfEmployees.add(personalFactory.getEmployeeFromDealerMap("seller"));
        listOfEmployees.add(personalFactory.getEmployeeFromDealerMap("seller"));
        listOfEmployees.add(personalFactory.getEmployeeFromDealerMap("marketer"));
        listOfEmployees.add(personalFactory.getEmployeeFromDealerMap("marketer"));
        for (LadaDealer listOfEmployee : listOfEmployees) {
            listOfEmployee.work();
        }
    }
}
