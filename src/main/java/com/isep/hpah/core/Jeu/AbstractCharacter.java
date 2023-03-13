package com.isep.hpah.core.Jeu;

public abstract class AbstractCharacter {
    //Variables
    public String name;
    public int hp;
    public int maxHp;

    //constructor for character

    public AbstractCharacter(String name, int Maxhp){
        this.name = name;
        this.hp = maxHp;
    }

    //methods every character has

    public abstract int attack();

}
