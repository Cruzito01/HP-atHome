package com.isep.hpah.core.Jeu;

public abstract class AbstractCharacter {
    //Variables

    private String name;
    private int maxHp;

    private int hp;

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getMaxHp(){
        return maxHp;
    }
    public void setMaxHp(int maxHp){
        this.maxHp = maxHp;
    }

    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    //constructor for character

    public AbstractCharacter(String name, int maxHp){
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }


}
