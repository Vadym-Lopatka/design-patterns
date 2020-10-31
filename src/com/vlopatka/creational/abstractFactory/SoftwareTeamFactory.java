package com.vlopatka.creational.abstractFactory;

public interface SoftwareTeamFactory {

    Dev getDev();

    Qa getQa();

    Pm getPm();
}
