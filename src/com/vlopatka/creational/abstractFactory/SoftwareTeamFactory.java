package com.vlopatka.creational.abstractFactory;

public interface SoftwareTeamFactory {

    public Dev getDev();

    public Qa getQa();

    public Pm getPm();
}
