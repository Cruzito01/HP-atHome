package com.isep.hpah.core.Jeu;

public class Potion {

    public String name;

    public int heal;


    public Potion(String name, int heal){
        this.name = name;
        this.heal = heal;
    }

    public void potionEffect(Wizard wizard){
        int heal = wizard.hp + this.heal;
        if (heal >= wizard.maxHp){
            wizard.hp = wizard.maxHp;
        }
        System.out.println("You heal yourself");
    }
}
