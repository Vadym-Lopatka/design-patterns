package com.vlopatka.creational.abstractFactory.webTeam.participants;

import com.vlopatka.creational.abstractFactory.Dev;

public class FullstackDev implements Dev {

    @Override
    public void develop() {
        System.out.println("FullstackDev is developing a web project.");
    }
}
