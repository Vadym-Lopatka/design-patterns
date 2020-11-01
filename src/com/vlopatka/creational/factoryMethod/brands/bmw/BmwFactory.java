package com.vlopatka.creational.factoryMethod.brands.bmw;

import com.vlopatka.creational.factoryMethod.Car;
import com.vlopatka.creational.factoryMethod.CarFactory;

public class BmwFactory implements CarFactory {
    @Override
    public Car buildCar() {
        return new Bmw();
    }
}
