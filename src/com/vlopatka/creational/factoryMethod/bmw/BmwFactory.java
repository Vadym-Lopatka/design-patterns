package com.vlopatka.creational.factoryMethod.bmw;

import com.vlopatka.creational.factoryMethod.Car;
import com.vlopatka.creational.factoryMethod.CarFactory;
import com.vlopatka.creational.factoryMethod.mercedes.Mercedes;

public class BmwFactory implements CarFactory {
    @Override
    public Car buildCar() {
        return new Bwm();
    }
}
