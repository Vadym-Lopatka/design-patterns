package com.vlopatka.creational.abstractFactory;

import com.vlopatka.creational.abstractFactory.webTeam.WebTeamFactory;

public class SoftwareTeamApp {

    public static void main(String[] args) {
        WebTeamFactory teamFactory = new WebTeamFactory();

        Dev dev = teamFactory.getDev();
        Qa qa = teamFactory.getQa();
        Pm pm = teamFactory.getPm();

        System.out.println("The software team is ready!");
        System.out.println("Let's create something...");

        dev.develop();
        qa.test();
        pm.manage();
    }
}
