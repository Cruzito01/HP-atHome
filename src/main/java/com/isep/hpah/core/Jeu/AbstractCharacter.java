package com.isep.hpah.core.Jeu;

public abstract class AbstractCharacter {
    //Variables
    public String name;
    public int maxHp,hp;

    //constructor for character

    public AbstractCharacter(String name, int maxHp){
        this.name = name;
        this.hp = maxHp;
        this.maxHp = maxHp;
    }

    //methods every character has

    public abstract int attack();

}
