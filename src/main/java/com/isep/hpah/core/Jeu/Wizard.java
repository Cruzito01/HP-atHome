package com.isep.hpah.core.Jeu;

public class Wizard extends AbstractCharacter{
    public Wizard(String name, int Maxhp) {
        super(name, Maxhp);
    }

    @Override
    public int attack() {
        return 0;
    }
}
