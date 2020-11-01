package com.vlopatka.creational.factoryMethod.mercedes;

import com.vlopatka.creational.factoryMethod.Car;

public class Mercedes implements Car {

    @Override
    public void startEngine() {
        System.out.println("Start mercedes engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop mercedes engine");
    }
}
