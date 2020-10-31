package com.vlopatka.creational.abstractFactory.webTeam;

import com.vlopatka.creational.abstractFactory.Dev;
import com.vlopatka.creational.abstractFactory.Pm;
import com.vlopatka.creational.abstractFactory.Qa;
import com.vlopatka.creational.abstractFactory.SoftwareTeamFactory;

public class WebTeamFactory implements SoftwareTeamFactory {
    @Override
    public Dev getDev() {
        return new FullstackDev();
    }

    @Override
    public Qa getQa() {
        return new ManualQa();
    }

    @Override
    public Pm getPm() {
        return new WebTeamPm();
    }
}
