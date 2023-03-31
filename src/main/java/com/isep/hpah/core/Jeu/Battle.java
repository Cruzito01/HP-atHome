package com.isep.hpah.core.Jeu;
import java.util.*;
public class Battle {
    public static int spellchoosen;
    public static int hpPlayer;
    public static int hpEnemy;

    public static void battleMenu() {
        hpEnemy = Enemy.enemies.get(GameLogic.act - 1).getHp();
        hpPlayer = GameLogic.wizard.getHp();
        while (hpPlayer > 0 && hpEnemy > 0) {
            GameLogic.printHeading("Battle Menu");
            System.out.println("Enemy: " + Enemy.enemies.get(GameLogic.act - 1).getName() + " / HP: " + hpEnemy);
            System.out.println("Wizard HP: " + hpPlayer);
            GameLogic.printSeperator(30);
            System.out.println(Color.BLUE.color + "(1) Attack" + Color.RESET.color);
            System.out.println(Color.CYAN.color + "(2) Use a Potion" + Color.RESET.color);
            System.out.println(Color.RED.color + "(5) Surrender" + Color.RESET.color);
            int choice = GameLogic.readInt("->", 5);
            switch (choice) {
                case 1:
                    GameLogic.printSeperator(30);
                    GameLogic.printHeading("Which Spell do you want to use ?");
                    for (int i = 0; i < GameLogic.knownSpells.size(); i++) {
                        int s = i + 1;
                        System.out.println((Color.CYAN.color) + "(" + s + ")" + (Color.RESET.color) + GameLogic.knownSpells.get(i).getName() + (Color.CYAN.color) + " -- Power: " + (Color.RESET.color) + GameLogic.knownSpells.get(i).getDamage() + (Color.CYAN.color) + " -- Accuracity: " + (Color.RESET.color) + GameLogic.knownSpells.get(i).getAccuracy());
                    }
                    int choice2 = GameLogic.readInt("->", GameLogic.knownSpells.size());
                    spellchoosen = choice2 - 1;
                    damage();
                    damagesuffered();
                    break;
                case 2:
                    GameLogic.printHeading("You have " + Wizard.potions.size() + " Potions !");
                    System.out.println(Color.RED.color + "Do you want to use a potion ?" + Color.RESET.color);
                    GameLogic.printSeperator(30);
                    System.out.println("(1) YES");
                    System.out.println("(2) NO");
                    int choice3 = GameLogic.readInt("->", 2);
                    if (choice3 == 1) {
                        if (Wizard.potions.size() == 0) {
                            System.out.println("You have no Potions");
                            GameLogic.anythingToContinue();
                        }else {
                            playerHeal();
                            damagesuffered();
                        }
                    }else if (choice3 == 2){
                        System.out.println("No Potion used");
                    }
                    break;
                case 5:
                    hpPlayer = 0;
                    default:
                    }
            }
        }


        public static void fight () {
            Enemy.createEnemies();
            GameLogic.clearConsole();
            GameLogic.printHeading("NEW ENEMY !");
            System.out.println("A new enemy appear, you will fight " + Enemy.enemies.get(GameLogic.act - 1).getName());
            GameLogic.anythingToContinue();
            GameLogic.clearConsole();
            battleMenu();
            if (hpPlayer <= 0) {
                System.out.println("This hit was fatal");
            } else {
                System.out.println("You won");
                GameLogic.anythingToContinue();
            }
        }

        public static void damage () {
            System.out.println("You attack the enemy with " + GameLogic.knownSpells.get(spellchoosen).getName());
            int chancetohit = (int) (Math.random() * 101);
            if (chancetohit < (GameLogic.knownSpells.get(spellchoosen).getAccuracy() + GameLogic.wizard.getAccuracy())) {
                int damage1 = GameLogic.knownSpells.get(spellchoosen).getDamage() + GameLogic.wizard.getStrength();
                System.out.println("You hit the enemy !");
                System.out.println("you did " + Color.RED.color + damage1 + Color.RESET.color + " damages !");
                hpEnemy -= damage1;
            } else {
                System.out.println("You failed the enemy !");
                GameLogic.anythingToContinue();
            }
            GameLogic.anythingToContinue();
        }

        public static void damagesuffered() {
            if (hpEnemy > 0) {
                int chancetohit2 = (int) (Math.random() * 101);
                if (chancetohit2 < Enemy.enemies.get(GameLogic.act - 1).getAccuracy()) {
                    int damage2 = (Enemy.enemies.get(GameLogic.act - 1).getStrength() - GameLogic.wizard.getDef());
                    System.out.println("The enemy hit you !");
                    System.out.println("You took " + Color.RED.color + damage2 + Color.RESET.color + " damages !");
                    hpPlayer -= damage2;
                } else {
                    System.out.println("You didnt get hit !");
                }
                GameLogic.anythingToContinue();
            }else {
                System.out.println("You won !");
                GameLogic.anythingToContinue();
            }
        }

        public static void playerHeal(){
            int heal = hpPlayer + Potion.getHeal();
            hpPlayer = heal;
            Wizard.usePotion();
            if(heal > GameLogic.wizard.getMaxHp()){
                hpPlayer = GameLogic.wizard.getMaxHp();
            }
            System.out.println("You heal yourself");
        }
    }
