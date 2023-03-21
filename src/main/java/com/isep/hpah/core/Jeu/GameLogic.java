package com.isep.hpah.core.Jeu;
import java.awt.*;
import java.sql.SQLOutput;
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
                System.out.println("Please enter an integer!");
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
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }

    public static void startGame(){
        boolean  nameSet = false;
        String name;
        //print title screen
        clearConsole();
        printSeperator(40);
        printSeperator(30);
        System.out.println("It's the start of your Adventure !");
        System.out.println("Game RPG");
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
            System.out.println("(1) Yes !");
            System.out.println("(2) No, I will repeat !");
            int input = readInt("-> ", 2);
            if(input == 1)
                nameSet = true;
        }while(!nameSet);

        //create new player Object with the name
        wizard = new Wizard(name, 25, 70, 40);
        Wizard.house.houseEffect(Wizard.house, wizard, new Potion("Potion", 50));

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


            Story.printActI_Outro();

            //increment act and place
            act = 2;
            place = 1;
        }
        else if (act == 2){

            Story.printActII_Intro();
            Story.printActII_Outro();

            act = 3;
            place = 2;
        }
        else if (act == 3){

            Story.printActIII_Intro();
            Story.printActIII_Outro();

            act = 4;
            place = 3;
        }
        else if (act == 4){

            Story.printActIV_Intro();
            Story.printActIV_Outro();

            act = 5;
            place = 4;
        }
        else if (act == 5){

            Story.printActV_Intro();
            Story.printActV_Outro();

            act = 6;
            place =5;
        }
        else if (act == 6){

            Story.printActVI_Intro();
            Story.printActVI_Outro();

            act = 7;
            place = 6;
        }
        else{
            Story.printActVII_Intro();
            Story.printActVII_Outro();
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
        printHeading("CHARACTER INFO");
        System.out.println(wizard.name + "\tHP:" + wizard.hp);
        printSeperator(20);
        System.out.println("Strength: "+ wizard.strength + "/ Accuracy: " + wizard.accuracy + "/ Def:" + wizard.def);
        System.out.println(Wizard.pet);
        System.out.println(Wizard.house.name);
        System.out.println(Wizard.wandCore);
        System.out.println(Wizard.wandSize);

        //spells known (à faire)

        anythingToContinue();
    }
    //printing the main menu
    public static void printMenu(){
        clearConsole();
        printHeading(places[place]);
        System.out.println("What you want to do ?");
        printSeperator(20);
        System.out.println("(1) Continue");
        System.out.println("(2) Character Info");
        System.out.println("(3) Exit Game");
    }
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