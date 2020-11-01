package com.vlopatka.creational.factoryMethod;

import com.vlopatka.creational.factoryMethod.brands.audi.Audi;
import com.vlopatka.creational.factoryMethod.brands.bmw.Bmw;
import com.vlopatka.creational.factoryMethod.brands.mercedes.Mercedes;

enum CarType {
    MERCEDES, BMW, AUDI
}

public class CarService {

    public static void main(String[] args) {
        Car car = buildCarByType(CarType.AUDI);

        car.startEngine();
        System.out.println(">>  Engine has been started");
        car.stopEngine();
    }

    static Car buildCarByType(CarType type) {
        return switch (type) {
            case MERCEDES -> new Mercedes();
            case BMW -> new Bmw();
            case AUDI -> new Audi();
        };
    }
}