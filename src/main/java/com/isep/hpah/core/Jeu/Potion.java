package com.isep.hpah.core.Jeu;

public class Potion {

    public String name;
    public int heal;


    public Potion(String name, int heal){
        this.name = name;
        this.heal = heal;
    }

    public void potionEffect(Wizard wizard){
        wizard.hp += this.heal;
        if (wizard.hp > wizard.maxHp){
            wizard.hp = wizard.maxHp;
        }
        System.out.println("You heal yourself");
    }
}
