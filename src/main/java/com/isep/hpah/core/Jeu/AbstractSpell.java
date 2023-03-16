package com.isep.hpah.core.Jeu;

public abstract class AbstractSpell {

    public String name;

    public int  accuracy;

    //constructor for character

    public AbstractSpell(String name,  int accuracy){
        this.name = name;
        this.accuracy = accuracy;
    }

    //methods every spell has

    public abstract int damages();
}
