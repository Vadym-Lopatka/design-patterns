package com.vlopatka.creational.abstractFactory.webTeam;

import com.vlopatka.creational.abstractFactory.Dev;
import com.vlopatka.creational.abstractFactory.Pm;
import com.vlopatka.creational.abstractFactory.Qa;
import com.vlopatka.creational.abstractFactory.SoftwareTeamFactory;
import com.vlopatka.creational.abstractFactory.webTeam.participants.FullstackDev;
import com.vlopatka.creational.abstractFactory.webTeam.participants.ManualQa;
import com.vlopatka.creational.abstractFactory.webTeam.participants.WebTeamPm;

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
