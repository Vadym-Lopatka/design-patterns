package com.vlopatka.creational.factoryMethod.brands.audi;

import com.vlopatka.creational.factoryMethod.Car;
import com.vlopatka.creational.factoryMethod.CarFactory;

public class AudiFactory implements CarFactory {
    @Override
    public Car buildCar() {
        return new Audi();
    }
}
