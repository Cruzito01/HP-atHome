package com.isep.hpah.core.Jeu;

import static com.isep.hpah.core.Jeu.GameLogic.*;

public enum Pet {
    OWL,
    RAT,
    CAT,
    TOAD;

    public static Pet choosePet() {
        boolean petSet = false;
        int choose;
        Pet petChoosen;
        do {
            clearConsole();
            printHeading("Choose a pet");
            System.out.println("(1) OWL");
            System.out.println("(2) RAT");
            System.out.println("(3) CAT");
            System.out.println("(4) TOAD");
            int input = readInt("->", 4);
            if (input == 1)
                choose = 0;
            else if (input == 2)
                choose = 1;
            else if (input == 3)
                choose = 2;
            else
                choose = 3;
            Pet[] values = Pet.values();
            int Index = choose;
            petChoosen = values[Index];
            //correct pet ?
            clearConsole();
            printHeading("Did I hear " + petChoosen + " ?");
            System.out.println((Color.GREEN.color) + "(1) Yes !" + (Color.RESET.color));
            System.out.println((Color.RED.color) + "(2) No, I will repeat !" + (Color.RESET.color));
            input = readInt("-> ", 2);
            if (input == 1)
                petSet = true;
        } while (!petSet);

        return petChoosen;
    }
}
