package com.isep.hpah.core.Jeu;

public class Spell extends AbstractSpell {

    public Spell(String name, int accuracy) {
        super(name, accuracy);
    }

    @Override
    public int damages() {
        return 0;
    }
}
