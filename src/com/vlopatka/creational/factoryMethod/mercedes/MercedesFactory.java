package com.vlopatka.creational.factoryMethod.mercedes;

import com.vlopatka.creational.factoryMethod.Car;
import com.vlopatka.creational.factoryMethod.CarFactory;

public class MercedesFactory implements CarFactory {
    @Override
    public Car buildCar() {
        return new Mercedes();
    }
}
