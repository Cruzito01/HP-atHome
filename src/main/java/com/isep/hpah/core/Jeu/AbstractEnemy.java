package com.isep.hpah.core.Jeu;

public abstract class AbstractEnemy extends AbstractCharacter{
    public AbstractEnemy(String name, int maxHp) {
        super(name, maxHp);
    }

    @Override
    public int attack() {
        return 0;
    }


}
