package com.isep.hpah.core.Jeu;

public class Battle {

    public void displayMenu(){
        GameLogic.printHeading("Battle Menu");
        System.out.println("(1) Attack");
        System.out.println("(2) Use a Potion");
        System.out.println("(0) Exit Game");
        int choice = GameLogic.readInt("->",3);
        switch(choice){
            case 1:
                //wizard.attack();
                break;
            case 2:
                //usePotion();
                break;
            case 3:
                //exit();
                break;
            default:
        }
    }


    public static void fight(){
        Enemy.createEnemies();
        GameLogic.clearConsole();
        GameLogic.printHeading("NEW ENEMY !");
        System.out.println("A new enemy appear, you will fight " + Enemy.enemies.get(0).getName());
        //displayMenu();
    }




}
