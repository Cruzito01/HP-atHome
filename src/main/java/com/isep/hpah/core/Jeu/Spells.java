package com.isep.hpah.core.Jeu;

public class Spells {

    //variables
    private String name;
    private int damage;
    private float accuracy;

    //constructor
    public Spells(String name, int damage, float accuracy) {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    // set and get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    static public void newSpell1() {
        GameLogic.knownSpells.add(GameLogic.accio);
        GameLogic.clearConsole();
        GameLogic.printHeading((Color.PURPLE.color) +"New Spell"+(Color.RESET.color));
        System.out.println((Color.RED.color) + "You learn a new Spell during this year:" + (Color.RESET.color));
        System.out.println((Color.CYAN.color)+ "Name:" + (Color.RESET.color) + GameLogic.knownSpells.get(2).getName()  + (Color.CYAN.color)  +" \nDamage: " + (Color.RESET.color) + GameLogic.knownSpells.get(2).getDamage() + (Color.CYAN.color) + "\nAccuracy: " + (Color.RESET.color) + GameLogic.knownSpells.get(2).getAccuracy());
        GameLogic.anythingToContinue();
    }

    static public void newSpell2() {
        GameLogic.knownSpells.add(GameLogic.expectoPatronum);
        GameLogic.clearConsole();
        GameLogic.printHeading((Color.PURPLE.color) +"New Spell"+(Color.RESET.color));
        System.out.println((Color.RED.color) + "You learn a new Spell during this year:" + (Color.RESET.color));
        System.out.println("Name: " + GameLogic.knownSpells.get(3).getName() + "\nDamage: " + GameLogic.knownSpells.get(3).getDamage() + "\nAccuracy: " + GameLogic.knownSpells.get(3).getAccuracy());
        GameLogic.anythingToContinue();
    }

    static public void newSpell3() {
        GameLogic.knownSpells.add(GameLogic.sectumSempra);
        GameLogic.clearConsole();
        GameLogic.printHeading((Color.PURPLE.color) +"New Spell"+(Color.RESET.color));
        System.out.println((Color.RED.color) + "You learn a new Spell during this year:" + (Color.RESET.color));
        System.out.println("Name: " + GameLogic.knownSpells.get(4).getName() + "\nDamage: " + GameLogic.knownSpells.get(4).getDamage() + "\nAccuracy: " + GameLogic.knownSpells.get(4).getAccuracy());
        GameLogic.anythingToContinue();
    }

    static public void newSpell4() {
        GameLogic.knownSpells.add(GameLogic.expelliarmus);
        GameLogic.clearConsole();
        GameLogic.printHeading((Color.PURPLE.color) +"New Spell"+(Color.RESET.color));
        System.out.println((Color.RED.color) + "You learn a new Spell during this year:" + (Color.RESET.color));
        System.out.println("Name: " + GameLogic.knownSpells.get(5).getName() + "\nDamage: " + GameLogic.knownSpells.get(5).getDamage() + "\nAccuracy: " + GameLogic.knownSpells.get(5).getAccuracy());
        GameLogic.anythingToContinue();
    }

}
