package com.isep.hpah.core.Jeu;

public class Potion {

    private String name;
    private int heal;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHeal(){
        return heal;
    }
    public void setHeal(int heal){
        this.heal = heal;
    }
    public Potion(String name, int heal){
        this.name = name;
        this.heal = heal;
    }

    public void potionEffect(Wizard wizard){
        wizard.setHp(wizard.getHp()+ this.heal); ;
        if (wizard.getHp()  > wizard.getHp()){
            wizard.setHp(wizard.getMaxHp());
        }
        System.out.println("You heal yourself");
    }
}
