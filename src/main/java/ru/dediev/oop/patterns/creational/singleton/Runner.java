package ru.dediev.oop.patterns.creational.singleton;

public class Runner {
    public static void main(String[] args) {

        //Подключаемся к базе!
        System.out.println(Singleton.getInstance("jdbc:postgreSql://localhost/store"));

        //Проверка на то, что объект у нас только один.
        System.out.println(Singleton.getInstance("").toString());
        System.out.println(Singleton.getInstance("").toString());
        System.out.println(Singleton.getInstance("").toString());
        System.out.println(Singleton.getInstance("").toString());

    }
}
