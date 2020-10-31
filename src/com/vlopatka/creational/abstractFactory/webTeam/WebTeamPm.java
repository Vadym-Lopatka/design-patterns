package com.vlopatka.creational.abstractFactory.webTeam;

import com.vlopatka.creational.abstractFactory.Pm;

public class WebTeamPm implements Pm {

    @Override
    public void manage() {
        System.out.println("WebTeamPm is managing a web project.");
    }
}
