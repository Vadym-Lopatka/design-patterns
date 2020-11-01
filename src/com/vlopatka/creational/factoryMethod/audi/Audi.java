package com.vlopatka.creational.factoryMethod.audi;

import com.vlopatka.creational.factoryMethod.Car;

public class Audi implements Car {

    @Override
    public void startEngine() {
        System.out.println("Start Audi engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Audi engine");
    }
}
