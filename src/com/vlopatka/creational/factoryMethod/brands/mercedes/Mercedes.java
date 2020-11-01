package com.vlopatka.creational.factoryMethod.brands.mercedes;

import com.vlopatka.creational.factoryMethod.Car;

public class Mercedes implements Car {

    @Override
    public void startEngine() {
        System.out.println("Start Mercedes engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Mercedes engine");
    }
}
