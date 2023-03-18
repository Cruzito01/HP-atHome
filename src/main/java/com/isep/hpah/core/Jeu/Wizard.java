package com.isep.hpah.core.Jeu;

import java.util.*;

import javax.swing.*;

public class Wizard extends AbstractCharacter {

    public int def;
    public int accuracy;
    public int strength;

    public List<Potion> potions = new ArrayList<>();

    public Wizard(String name, int def, int accuracy, int strength) {
        super(name, 100);
        this.def = def;
        this.accuracy = accuracy;
        this.strength = strength;
        this.potions.add(new Potion("Potion", 50));
    }

    @Override
    public int attack() {
        return 0;
    }

    static String wandCore = Wand.wandCore;
    static Integer wandSize = Wand.wandSize();
    static House house = new House(SortingHat.houserand);
    static String pet = String.valueOf(Pet.choosePet());

    public void setDef(int def) {
        this.def = def;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void newPotion(Potion potion) {
        this.potions.add(potion);
    }

    public void usePotion(){
        this.potions.remove(0);
    }
}