package com.isep.hpah.core.Jeu;

public class Wizard extends AbstractCharacter{
    public Wizard(String name) {
        super(name, 100);
    }

    @Override
    public int attack() {
        return 0;
    }
}
