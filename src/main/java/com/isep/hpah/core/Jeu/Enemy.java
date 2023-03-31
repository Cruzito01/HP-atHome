package com.isep.hpah.core.Jeu;

import java.util.ArrayList;
import java.util.List;

public class Enemy extends AbstractCharacter{

    private int accuracy;
    private int strength;

    public Enemy(String name, int maxHp, int accuracy, int strength) {
        super(name, maxHp);
        this.accuracy = accuracy;
        this.strength = strength;
    }

    public int getAccuracy(){
        return accuracy;
    }
    public void setAccuracy(int accuracy){
        this.accuracy = accuracy;
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        this.strength= strength;
    }
    static Enemy[] enemy = new Enemy[8];
    static List<Enemy> enemies = new ArrayList<>();
    static Enemy troll = new Enemy("Troll", 100, 80, 50);
    static Enemy basilic = new Enemy("Basilic", 100, 80, 50);
    static Enemy dementors = new Enemy("Dementors", 100, 80,50);
    static Enemy voldemort1 = new Enemy("Dementors", 100, 80,50);
    static Enemy doloresOmbrage = new Enemy("Dolores Ombrage", 100, 80,50);
    static Enemy deathEaters = new Enemy("Death Eaters", 100, 80,50);
    static Enemy voldemort2 = new Enemy("Voldemort", 100, 80,50);
    static Enemy bellatrixLestrange = new Enemy("Bellatrix Lestrange", 100, 80,50);
    static Enemy peterPettigrow = new Enemy("Peter Pettigrow", 100, 80,50);

    public static void createEnemies(){
        enemies.add(troll);
        enemies.add(basilic);
        enemies.add(dementors);
        enemies.add(voldemort1);
        enemies.add(peterPettigrow);
        enemies.add(doloresOmbrage);
        enemies.add(deathEaters);
        enemies.add(voldemort2);
        enemies.add(bellatrixLestrange);
    }


    /*
public static Enemy troll() {
        return new Enemy("Troll",200, 0.70F,30);
}
public static Enemy basilic() {
        return new Enemy("Basilic",200,0.80F,35);
}
public static Enemy dementors(){
        return new Enemy("Dementors",200, 0.75F, 40);
}
public static Enemy voldemort1(){
        return new Enemy("Voldemort",200,0.60F, 40);
}
public static Enemy peterPettigrow(){
        return new Enemy("Peter Pettigrow",200, 0.40F, 40);
}
public static Enemy doloresOmbrage(){
        return new Enemy("Dolores Ombrage", 200, 0.80F,65);
}
public static Enemy deathEaters(){
        return new Enemy("Death Eaters",200,0.90F,70);
}
public static Enemy voldemort2(){
        return new Enemy("Voldemort",200,0.20F,100);
}
public static Enemy bellatrixLestrange(){
        return new Enemy("Bellatrix Lestrange",200,0.20F,100);
}

     */
}
