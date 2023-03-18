package com.isep.hpah.core.Jeu;

public class ForbiddenSpell extends AbstractSpell{
    public ForbiddenSpell(String name) {
        super(name);
    }

    @Override
    public int damages() {
        return 0;
    }
}
