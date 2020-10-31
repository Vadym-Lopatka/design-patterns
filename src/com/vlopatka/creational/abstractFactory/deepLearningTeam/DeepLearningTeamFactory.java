package com.vlopatka.creational.abstractFactory.deepLearningTeam;

import com.vlopatka.creational.abstractFactory.Dev;
import com.vlopatka.creational.abstractFactory.Pm;
import com.vlopatka.creational.abstractFactory.Qa;
import com.vlopatka.creational.abstractFactory.SoftwareTeamFactory;
import com.vlopatka.creational.abstractFactory.deepLearningTeam.participants.DeepLearningDev;
import com.vlopatka.creational.abstractFactory.deepLearningTeam.participants.DeepLearningPm;
import com.vlopatka.creational.abstractFactory.deepLearningTeam.participants.DeepLearningQa;

public class DeepLearningTeamFactory implements SoftwareTeamFactory {
    @Override
    public Dev getDev() {
        return new DeepLearningDev();
    }

    @Override
    public Qa getQa() {
        return new DeepLearningQa();
    }

    @Override
    public Pm getPm() {
        return new DeepLearningPm();
    }
}
