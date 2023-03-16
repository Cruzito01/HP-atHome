package com.isep.hpah.core.Jeu;

public class ForbiddenSpell extends AbstractSpell{
    public ForbiddenSpell(String name, int accuracy) {
        super(name, accuracy);
    }

    @Override
    public int damages() {
        return 0;
    }
}
