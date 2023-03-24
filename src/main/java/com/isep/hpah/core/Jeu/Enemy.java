package com.isep.hpah.core.Jeu;

public class Enemy extends AbstractCharacter{

    public float accuracy;

    public int strength;

    public Enemy(String name, int maxHp, float accuracy, int strength) {
        super(name, maxHp);
        this.accuracy = accuracy;
        this.strength = strength;
    }

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
}
