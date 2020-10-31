package com.vlopatka.creational.abstractFactory.webTeam.participants;

import com.vlopatka.creational.abstractFactory.Qa;

public class ManualQa implements Qa {

    @Override
    public void test() {
        System.out.println("ManualQa is testing a web project.");
    }
}
