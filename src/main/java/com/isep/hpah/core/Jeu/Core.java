package com.isep.hpah.core.Jeu;

import java.util.Random;

public enum Core {
    Dragon_heartstring,
    Phoenix_feather,
    Unicorn_hair;

    public static Core generateRandomCore() {
        Core[] values = Core.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}
