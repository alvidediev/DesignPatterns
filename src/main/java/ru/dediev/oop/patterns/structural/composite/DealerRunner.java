package ru.dediev.oop.patterns.structural.composite;

public class DealerRunner {
    public static void main(String[] args) {
        Team team = new Team();

        Employee rop = new Rop();
        Employee seller = new Seller();
        Employee marketer = new Marketer();

        team.addEmployees(rop);
        team.addEmployees(marketer);
        team.addEmployees(seller);

        team.doWork();
    }
}
