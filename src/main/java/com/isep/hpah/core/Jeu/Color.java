package com.isep.hpah.core.Jeu;

public enum Color {
    RESET ("\033[0m"),  // Text Reset
    BLACK  ("\033[0;30m"),   // BLACK
    RED ("\033[0;31m"),    // RED
    GREEN  ("\033[0;32m"),  // GREEN
    YELLOW  ("\033[0;33m"),  // YELLOW
    BLUE  ("\033[0;34m"),    // BLUE
    PURPLE  ("\033[0;35m"),  // PURPLE
    CYAN  ("\033[0;36m"),    // CYAN
    WHITE  ("\033[0;37m");   // WHITE
    final String color;
    Color(String color) {
        this.color = color;
    }
}
