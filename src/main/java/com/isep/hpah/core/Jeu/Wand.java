package com.isep.hpah.core.Jeu;


public class Wand {

    //wand core
    public static String wandCore = String.valueOf(Core.generateRandomCore());

    //wand size
    public static int wandSize() {
        return (int) ((Math.random() * (35 - 25)) + 25);
    }
}
