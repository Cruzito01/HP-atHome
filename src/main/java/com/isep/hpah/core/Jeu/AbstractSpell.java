package com.isep.hpah.core.Jeu;

public abstract class AbstractSpell {

    public String name;


    //constructor for character

    public AbstractSpell(String name){
        this.name = name;
    }

    //methods every spell has

    public abstract int damages();
}
