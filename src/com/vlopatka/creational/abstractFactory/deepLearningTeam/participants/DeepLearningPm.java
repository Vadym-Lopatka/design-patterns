package com.vlopatka.creational.abstractFactory.deepLearningTeam.participants;

import com.vlopatka.creational.abstractFactory.Pm;

public class DeepLearningPm implements Pm {
    @Override
    public void manage() {
        System.out.println("DeepLearningPm is managing an artificial intelligence project.");
    }
}
