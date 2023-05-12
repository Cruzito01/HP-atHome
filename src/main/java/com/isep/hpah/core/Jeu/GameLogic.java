package com.isep.hpah.core.Jeu;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Wizard wizard;

    public static boolean isRunning;

    //story elements
    public static int place = 0, act = 1;

    //places in the game
    public static String[] places = {"Intro","Dungeon toilet","Chamber of Secrets","Lake in the Forbidden Forest","Little Hangleton Cemetery","Hogwarts Exam Room","Astronomy Tower","Hogwarts"};

    //method to get user input from console
    public static int readInt(String prompt, int userChoices){
        int input;

        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println((Color.RED.color)+"Please enter an integer!" +(Color.RESET.color));
            }
        }while(input < 1 || input > userChoices);
        return input;
    }

    //method to simulate clearing out the console
    public static void clearConsole(){
        for(int i=0; i<100; i++)
            System.out.println();
    }

    //method to print a seperator with length n

    public static void printSeperator(int n){
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }
    //method ti print a heading
    public static void printHeading(String title){
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }

    //method to stop the game until user enters anything
    public static void anythingToContinue(){
        System.out.println((Color.YELLOW.color)+ "\nEnter anything to continue..."+ (Color.RESET.color));
        scanner.next();
    }

    public static void startGame(){
        boolean  nameSet = false;
        String name;
        //print title screen
        clearConsole();
        printSeperator(40);
        printSeperator(30);
        System.out.println((Color.PURPLE.color) + "It's the start of your Adventure !");
        System.out.println("Game RPG" + (Color.RESET.color));
        printSeperator(30);
        printSeperator(40);
        anythingToContinue();

        //getting the player name and the pet
        do{
            clearConsole();
            printHeading("Young Wizard, tell me your name");
            name = scanner.next();
            //correct name ?
            clearConsole();
            printHeading("Did I hear " + name + " ?");
            System.out.println((Color.GREEN.color) + "(1) Yes !" + (Color.RESET.color));
            System.out.println((Color.RED.color) + "(2) No, I will repeat !" + (Color.RESET.color));
            int input = readInt("-> ", 2);
            if(input == 1)
                nameSet = true;
        }while(!nameSet);

        //create new player Object with the name
        wizard = new Wizard(name, 5, 70, 40);
        Wizard.house.houseEffect(Wizard.house, wizard, new Potion("Potion", 50));
        knownSpells.add(basicAttack);
        knownSpells.add(wingardiumLeviosa);

        //print story intro
        Story.printIntro();
        Story.printIntro2();
        Story.printIntro3();
        Story.printIntro4();

        //setting isRunning to true, so the gameloop can continue
        isRunning = true;

        //start main game loop with the menu
        gameLoop();

    }

    public static void checkAct(){
        if(act == 1){
            Story.printActI_Intro();
            Battle.fight();
            if (Battle.hpPlayer > 0) {
                Story.printActI_Outro();
                // upgrade
                wizard.chooseUpgrade();
                //new spell accio
                Spells.newSpell1();
                //increment act and place
                act = 2;
                place = 1;
                wizard.setHp(wizard.getMaxHp());
                Wizard.potions.add(new Potion("Potion", 50));
            }else{
                System.out.println("You ARE DEAD");
                anythingToContinue();
            }
        }
        else if (act == 2){
            Story.printActII_Intro();
            Battle.fight();
            if (Battle.hpPlayer > 0) {
                Story.printActII_Outro();
                // upgrade
                wizard.chooseUpgrade();
                //new spell expecto patronum
                Spells.newSpell2();
                act = 3;
                place = 2;
                Battle.hpPlayer = wizard.getMaxHp();
                Wizard.potions.add(new Potion("Potion", 50));
            }else{
                System.out.println("You ARE DEAD");
                anythingToContinue();
            }
        }
        else if (act == 3){
            Story.printActIII_Intro();
            Battle.fight();
            if (Battle.hpPlayer > 0) {
                Story.printActIII_Outro();
                // upgrade
                wizard.chooseUpgrade();
                act = 4;
                place = 3;
                Battle.hpPlayer = wizard.getMaxHp();
                Wizard.potions.add(new Potion("Potion", 50));
            }else{
                System.out.println("You ARE DEAD");
                anythingToContinue();
            }
        }
        else if (act == 4){
            Story.printActIV_Intro();
            //fight
            if (Battle.hpPlayer > 0) {
                Story.printActIV_Outro();

                // upgrade
                wizard.chooseUpgrade();
                //new spell sectum sempra
                Spells.newSpell3();
                act = 5;
                place = 4;
                Battle.hpPlayer = wizard.getMaxHp();
                Wizard.potions.add(new Potion("Potion", 50));
            }else{
                System.out.println("You ARE DEAD");
                anythingToContinue();
            }
        }
        else if (act == 5){
            Story.printActV_Intro();
            Battle.fight();
            if (Battle.hpPlayer > 0) {
                Story.printActV_Outro();
                // upgrade
                wizard.chooseUpgrade();
                //new spell expediarmus
                Spells.newSpell4();
                act = 6;
                place = 5;
                Battle.hpPlayer = wizard.getMaxHp();
                Wizard.potions.add(new Potion("Potion", 50));
            }else{
                System.out.println("You ARE DEAD");
                anythingToContinue();
            }
        }
        else if (act == 6){
            Story.printActVI_Intro();
            Battle.fight();
            if (Battle.hpPlayer > 0) {
                Story.printActVI_Outro();
                // upgrade
                wizard.chooseUpgrade();
                act = 7;
                place = 6;
                Battle.hpPlayer = wizard.getMaxHp();
                Wizard.potions.add(new Potion("Potion", 50));
            }else{
                System.out.println("You ARE DEAD");
                anythingToContinue();
            }
        }
        else{
            Story.printActVII_Intro();
            //fight
            if (Battle.hpPlayer > 0) {
                Story.printActVII_Outro();
            }else{
                System.out.println("You ARE DEAD");
                anythingToContinue();
            }
        }
    }

    //method to continue de journey
    public static void continueJourney(){
        //check if act must be increased
        checkAct();
    }
    //printing character infos
    public static void characterInfo(){
        clearConsole();
        printHeading((Color.PURPLE.color) + "CHARACTER INFO" + (Color.RESET.color));
        System.out.println(wizard.getName() + "\tHP:" + wizard.getHp());
        printSeperator(20);
        System.out.println((Color.CYAN.color) +"Strength: "+(Color.RESET.color) + wizard.getStrength() + (Color.CYAN.color) + "/ Accuracy: "+ (Color.RESET.color) + wizard.getAccuracy() + (Color.CYAN.color) + "% / Def:"+ (Color.RESET.color) + wizard.getDef());
        System.out.println((Color.CYAN.color)+ "Pet: " +(Color.RESET.color) + Wizard.pet);
        System.out.println((Color.CYAN.color)+ "House: "+ (Color.RESET.color) + Wizard.house.name);
        System.out.println((Color.CYAN.color)+ "WandCore: "+ (Color.RESET.color) + Wizard.wandCore);
        System.out.println((Color.CYAN.color)+ "WandSize(cm): "+ (Color.RESET.color) + Wizard.wandSize);
        printSeperator(20);
        System.out.println("Spells known: ");
        for (int i = 0; i< knownSpells.size();i++) {
            System.out.println((Color.CYAN.color) + "Name Spell: " + (Color.RESET.color) + knownSpells.get(i).getName() + (Color.CYAN.color) + " -- Power: " + (Color.RESET.color) + knownSpells.get(i).getDamage() + (Color.CYAN.color) + " -- Accuracy: " + (Color.RESET.color) + knownSpells.get(i).getAccuracy());
        }
        anythingToContinue();
    }
    //printing the main menu
    public static void printMenu(){
        clearConsole();
        printHeading((Color.PURPLE.color) + places[place]+ (Color.RESET.color));
        System.out.println("What you want to do ?");
        printSeperator(20);
        System.out.println((Color.BLUE.color) + "(1) Continue" + (Color.RESET.color));
        System.out.println((Color.GREEN.color) + "(2) Character Info"+ (Color.RESET.color));
        System.out.println((Color.RED.color) + "(3) Exit Game"+ (Color.RESET.color));
    }

    //SPELLS
    static Spells[] spell = new Spells[6];
    static List<Spells> knownSpells = new ArrayList<>();
    static Spells basicAttack = new Spells("BasicAttack", 10, 100);
    static Spells wingardiumLeviosa = new Spells("Wingardium Leviosa", 5, 70);
    static Spells accio = new Spells("Accio", 10, 70);
    static Spells expectoPatronum = new Spells("Expecto Patronum", 0, 65);
    static Spells sectumSempra = new Spells("Sectumsempra", 100, 40);
    static Spells expelliarmus = new Spells("Expelliarmus", 30, 60);


    //main game loop
    public static void gameLoop(){
        while(isRunning){
            printMenu();
            int input = readInt("->", 3);
            if(input ==1)
                continueJourney();
            else if(input == 2)
                characterInfo();
            else
                isRunning = false;
        }
    }

}