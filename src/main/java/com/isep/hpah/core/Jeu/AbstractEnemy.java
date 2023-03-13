package com.isep.hpah.core.Jeu;

public abstract class AbstractEnemy extends AbstractCharacter{
    public AbstractEnemy(String name, int Maxhp) {
        super(name, Maxhp);
    }

    @Override
    public int attack() {
        return 0;
    }
}
