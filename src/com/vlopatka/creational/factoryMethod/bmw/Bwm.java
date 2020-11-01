package com.vlopatka.creational.factoryMethod.bmw;

import com.vlopatka.creational.factoryMethod.Car;

public class Bwm implements Car {

    @Override
    public void startEngine() {
        System.out.println("Start BMW engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop BMW engine");
    }
}
