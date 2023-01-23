package ru.dediev.oop.patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car implements Concern<Car> {
    private int vin;
    private String name;
    private String dateOfManufacture;

    @Override
    public Car copy() {
        return new Car(vin, name, dateOfManufacture);
    }
}
