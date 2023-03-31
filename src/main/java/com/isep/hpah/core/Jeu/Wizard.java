package com.isep.hpah.core.Jeu;

import java.util.*;

public class Wizard extends AbstractCharacter {
    private int def;
    private int accuracy;
    private int strength;

    public static List<Potion> potions = new ArrayList<>();


    public Wizard(String name, int def, int accuracy, int strength) {
        super(name, 100);
        this.def = def;
        this.accuracy = accuracy;
        this.strength = strength;
        potions.add(new Potion("Potion", 50));
    }

    static String wandCore = Wand.wandCore;
    static Integer wandSize = Wand.wandSize();
    static House house = new House(SortingHat.houserand);
    static String pet = String.valueOf(Pet.choosePet());


    public int getDef(){
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }

    public int getAccuracy(){
        return accuracy;
    }
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }


    //choose an upgrade after you win a boss
    public void chooseUpgrade(){
        GameLogic.clearConsole();
        GameLogic.printHeading((Color.RED.color)+"Choose an upgrade"+ (Color.RESET.color));
        System.out.println("You won ! You can now choose an upgrade :");
        System.out.println((Color.BLUE.color) + "(1) You upgrade your max health points." + (Color.RESET.color));
        System.out.println((Color.GREEN.color) + "(2) You improve your strength." + (Color.RESET.color));
        //get player choice:
        int input = GameLogic.readInt("->", 2);
        GameLogic.clearConsole();
        if(input == 1){
            GameLogic.printHeading( (Color.RED.color) + "You choose more health points !" + (Color.RESET.color));
            setMaxHp(getMaxHp() + 10);
        }else{
            GameLogic.printHeading((Color.RED.color) + "You choose more strength !"+ (Color.RESET.color));
            strength = strength + 10;
        }
        GameLogic.anythingToContinue();
    }

    public static void newPotion(Potion potion) {
        potions.add(potion);
    }

    public static void usePotion(){ potions.remove(0);
    }
}