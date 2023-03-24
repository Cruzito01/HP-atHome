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
        GameLogic.printHeading(ConsoleColors.PURPLE +"New Spell"+ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "You learn a new Spell during this year:" + ConsoleColors.RESET);
        System.out.println("Name: " + GameLogic.knownSpells.get(2).getName() + " \nDamage: " + GameLogic.knownSpells.get(2).getDamage() + "\nAccuracy: " + GameLogic.knownSpells.get(2).getAccuracy());
        GameLogic.anythingToContinue();
    }

    static public void newSpell2() {
        GameLogic.knownSpells.add(GameLogic.expectoPatronum);
        GameLogic.clearConsole();
        GameLogic.printHeading(ConsoleColors.PURPLE +"New Spell"+ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "You learn a new Spell during this year:" + ConsoleColors.RESET);
        System.out.println("Name: " + GameLogic.knownSpells.get(3).getName() + "\nDamage: " + GameLogic.knownSpells.get(3).getDamage() + "\nAccuracy: " + GameLogic.knownSpells.get(3).getAccuracy());
        GameLogic.anythingToContinue();
    }

    static public void newSpell3() {
        GameLogic.knownSpells.add(GameLogic.sectumSempra);
        GameLogic.clearConsole();
        GameLogic.printHeading(ConsoleColors.PURPLE +"New Spell"+ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "You learn a new Spell during this year:" + ConsoleColors.RESET);
        System.out.println("Name: " + GameLogic.knownSpells.get(4).getName() + "\nDamage: " + GameLogic.knownSpells.get(4).getDamage() + "\nAccuracy: " + GameLogic.knownSpells.get(4).getAccuracy());
        GameLogic.anythingToContinue();
    }

    static public void newSpell4() {
        GameLogic.knownSpells.add(GameLogic.expelliarmus);
        GameLogic.clearConsole();
        GameLogic.printHeading(ConsoleColors.PURPLE +"New Spell"+ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "You learn a new Spell during this year:" + ConsoleColors.RESET);
        System.out.println("Name: " + GameLogic.knownSpells.get(5).getName() + "\nDamage: " + GameLogic.knownSpells.get(5).getDamage() + "\nAccuracy: " + GameLogic.knownSpells.get(5).getAccuracy());
        GameLogic.anythingToContinue();
    }

    // Couleurs pour le text
    public class ConsoleColors {
        // Reset
        public static final String RESET = "\033[0m";  // Text Reset

        // Regular Colors
        public static final String BLACK = "\033[0;30m";   // BLACK
        public static final String RED = "\033[0;31m";     // RED
        public static final String GREEN = "\033[0;32m";   // GREEN
        public static final String YELLOW = "\033[0;33m";  // YELLOW
        public static final String BLUE = "\033[0;34m";    // BLUE
        public static final String PURPLE = "\033[0;35m";  // PURPLE
        public static final String CYAN = "\033[0;36m";    // CYAN
        public static final String WHITE = "\033[0;37m";   // WHITE

    }
}
