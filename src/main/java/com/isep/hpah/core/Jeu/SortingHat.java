package com.isep.hpah.core.Jeu;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;
public class SortingHat {

    static String[] houses = {"Hufflepuff","Slytherin","Gryffindor","Ravenclaw"};

    static int rand = (int) (Math.random() * houses.length);

    static String houserand = houses[rand];

}

