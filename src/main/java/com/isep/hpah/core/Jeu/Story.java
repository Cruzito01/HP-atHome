package com.isep.hpah.core.Jeu;

public class Story {

    public static void printIntro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("INTRO");
        GameLogic.printSeperator(30);
        System.out.println("You have been chosen as a student at the prestigious Hogwarts School. ");
        System.out.println("You will have seven years before you graduate.");
        System.out.println("During these years, you will have to take steps and defeat enemies who are ready to put your life in danger.");
        GameLogic.anythingToContinue();
    }

    public static void printIntro2(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("INTRO 2");
        GameLogic.printSeperator(30);
        System.out.println(" Now that you’ve joined Hogwarts, the Sorting Hat will decide your home.  ");
        System.out.println("You will also receive a unique magic wand.");
        GameLogic.anythingToContinue();
    }

    public static void printIntro3(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("INTRO 3");
        GameLogic.printSeperator(30);
        System.out.println(" Welcome, young wizard, now that you have your house and you have your wand in your hand,");
        System.out.println("you will be able to start your studies. ");
        GameLogic.anythingToContinue();
    }
}
