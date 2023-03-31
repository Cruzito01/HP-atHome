package com.isep.hpah.core.Jeu;

public class Potion {

    private static String name;
    private static int heal;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public Potion(String name, int heal) {
        this.name = name;
        this.heal = heal;
    }

}
