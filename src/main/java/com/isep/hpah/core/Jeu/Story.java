package com.isep.hpah.core.Jeu;

import static com.isep.hpah.core.Jeu.GameLogic.wizard;

public class Story {

    public static void printIntro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"INTRO"+(Color.PURPLE.color));
        GameLogic.printSeperator(30);
        System.out.println("You have been chosen as a student at the prestigious Hogwarts School. ");
        System.out.println("You will have seven years before you graduate.");
        System.out.println("During these years, you will have to take steps and defeat enemies who are ready to put your life in danger.");
        GameLogic.anythingToContinue();
    }

    public static void printIntro2(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"INTRO"+(Color.PURPLE.color));
        GameLogic.printSeperator(30);
        System.out.println(" Now that you’ve joined Hogwarts, the Sorting Hat will decide your home.  ");
        System.out.println("You will also receive a unique magic wand.");
        GameLogic.anythingToContinue();
    }

    public static void printIntro3(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"INTRO"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println("Your home is "+ Color.CYAN.color + Wizard.house.name + (Color.RESET.color));
        System.out.println("Wand core: " + Color.CYAN.color  + Wizard.wandCore + (Color.RESET.color));
        System.out.println("Wand size: " + Color.CYAN.color  + Wizard.wandSize + (Color.RESET.color));
        GameLogic.anythingToContinue();
    }

    public static void printIntro4(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"INTRO"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println("Wizard " + wizard.getName() + ", now you are ready to start your journey");
        System.out.println("Let's start !");
        GameLogic.anythingToContinue();
    }

    public static void printActI_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The PHILOSOPHER'S STONE"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(wizard.getName() + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActI_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The PHILOSOPHER'S STONE"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println("You did it ! You won the ogre. You’re a pretty good magician");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActII_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Chamber of Secrets"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(wizard.getName() + " please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActII_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color)+"The Chamber of Secrets"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActIII_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Prisonner of Azkaban"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActIII_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Prisonner of Azkaban"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActIV_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Goblet of Fire"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActIV_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Goblet of Fire"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActV_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Order of the Phenix"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActV_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Order of the Phenix"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActVI_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Half-Blood Prince"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActVI_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Half-Blood Prince"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActVII_Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Deathly Hallows"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }

    public static void printActVII_Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println((Color.PURPLE.color) +"The Deathly Hallows"+(Color.RESET.color));
        GameLogic.printSeperator(30);
        System.out.println(" please come fast in the toilet ! I heard someone screaming !");
        System.out.println("When you come to the toilet you see a huge ogre, you have no choice but to afronter it");
        System.out.println("Good Luck !");
        GameLogic.anythingToContinue();
    }
}

