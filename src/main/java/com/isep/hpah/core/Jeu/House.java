package com.isep.hpah.core.Jeu;

public class House {
    public House(String name) {
        this.name = name;
    }

    public String name;

    public void houseEffect(House house, Wizard wizard, Potion potion){
        String name = house.name;
        switch (name) {
            case "Gryffindor" -> wizard.setDef(50);
            case "Slytherin" -> wizard.setStrength(50);
            case "Ravenclaw" -> wizard.setAccuracy(80);
            case "Hufflepuff" -> potion.setHeal(50);
        }
     }
}
