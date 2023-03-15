package com.isep.hpah.core.Jeu;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;
public class SortingHat {
    public static String[] list = {"Hufflepuff","Slytherin","Gryffindor","Ravenclaw"};

    public Random getRandomElement(List<String> list) {
        Random rand = new Random();
        String random = list.get(rand.nextInt(list.size()));
        return rand;
    }

    public void houserandom(){
        System.out.println("You have your house:" + getRandomElement("Hufflepuff","Slytherin","Gryffindor","Ravenclaw"));
    }

}

