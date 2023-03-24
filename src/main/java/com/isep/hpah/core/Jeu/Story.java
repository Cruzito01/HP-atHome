package com.isep.hpah.core.Jeu;

import static com.isep.hpah.core.Jeu.GameLogic.wizard;

public class Story {

    public static void printIntro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"INTRO"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println("You have been chosen as a student at the prestigious Hogwarts School. ");
        System.out.println("You will have seven years before you graduate.");
        System.out.println("During these years, you will have to take steps and defeat enemies who are ready to put your life in danger.");
        GameLogic.anythingToContinue();
    }

    public static void printIntro2(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"INTRO"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(" Now that you’ve joined Hogwarts, the Sorting Hat will decide your home.  ");
        System.out.println("You will also receive a unique magic wand.");
        GameLogic.anythingToContinue();
    }

    public static void printIntro3(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"INTRO"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println("Your home is "+ Wizard.house.name);
        System.out.println("Wand core: " + Wizard.wandCore);
        System.out.println("Wand size: " + Wizard.wandSize);
        GameLogic.anythingToContinue();
    }

    public static void printIntro4(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"INTRO"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println("Wizard " + wizard.name + ", now you are ready to start your journey");
        System.out.println("Let's start !");
        GameLogic.anythingToContinue();
    }

    public static void printActI_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The PHILOSOPHER'S STONE"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActI_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The PHILOSOPHER'S STONE"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println("You did it ! You won the ogre. You’re a pretty good magician");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActII_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Chamber of Secrets"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActII_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Chamber of Secrets"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActIII_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Prisonner of Azkaban"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActIII_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Prisonner of Azkaban"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActIV_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Goblet of Fire"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActIV_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Goblet of Fire"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActV_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Order of the Phenix"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActV_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Order of the Phenix"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActVI_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Half-Blood Prince"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActVI_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Half-Blood Prince"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActVII_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Deathly Hallows"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActVII_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println(Spells.ConsoleColors.PURPLE +"The Deathly Hallows"+Spells.ConsoleColors.RESET);
        GameLogic.printSeperator(30);
        System.out.println(wizard.name + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }
}

