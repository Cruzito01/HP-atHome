package com.isep.hpah.core.Jeu;

public class Wizard extends AbstractCharacter{
    public Wizard(String name) {
        super(name, 100);
    }

    @Override
    public int attack() {
        return 0;
    }

    static String wandCore = Wand.wandCore;
    static Integer wandSize = Wand.wandSize();
    static String house = SortingHat.houserand;
    static String pet = String.valueOf(Pet.choosePet());

}
