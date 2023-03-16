package com.isep.hpah.core.Jeu;

public abstract class AbstractCharacter {
    //Variables
    public String name;
    public int maxHp,hp,lvl;

    //constructor for character

    public AbstractCharacter(String name, int maxHp, int lvl){
        this.name = name;
        this.maxHp = maxHp;
        this.lvl = lvl;
        this.hp = maxHp;
    }

    //methods every character has

    public abstract int attack();

}
