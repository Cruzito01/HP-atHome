package com.isep.hpah.core.Jeu;

import java.util.*;

public class Wizard extends AbstractCharacter {
    public int def;
    public float accuracy;
    public int strength;

    public List<Potion> potions = new ArrayList<>();


    public Wizard(String name, int def, float accuracy, int strength) {
        super(name, 100);
        this.def = def;
        this.accuracy = accuracy;
        this.strength = strength;
        this.potions.add(new Potion("Potion", 50));
    }

    static String wandCore = Wand.wandCore;
    static Integer wandSize = Wand.wandSize();
    static House house = new House(SortingHat.houserand);
    static String pet = String.valueOf(Pet.choosePet());


    public void setDef(int def) {
        this.def = def;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    //choose an upgrade after you win a boss
    public void chooseUpgrade(){
        GameLogic.clearConsole();
        GameLogic.printHeading(Spells.ConsoleColors.RED +"Choose an upgrade"+ Spells.ConsoleColors.RESET);
        System.out.println("You won ! You can now choose an upgrade :");
        System.out.println("(1) You upgrade your max health points.");
        System.out.println("(2) You improve your strength.");
        //get player choice:
        int input = GameLogic.readInt("->", 2);
        GameLogic.clearConsole();
        if(input == 1){
            GameLogic.printHeading("You choose more health points !");
            maxHp = maxHp + 10;
        }else{
            GameLogic.printHeading("You choose more strength !");
            strength = strength + 10;
        }
        GameLogic.anythingToContinue();
    }

    public void newPotion(Potion potion) {
        this.potions.add(potion);
    }

    public void usePotion(){
        this.potions.remove(0);
    }
}