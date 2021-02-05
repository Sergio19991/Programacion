package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Material material1 = new Cristal("MATERIAL 1", 20, 30, 5, true, Tipo.TRANSLUCIDO);
        Material material2 = new Cristal("MATERIAL 2", 40, 60, 9, false, Tipo.TRANSPARENTE);
        Material material3 = new Rocas("MATERIAL 3", 80, 1, 6, false, 80);
        Material material4 = new Rocas("MATERIAL 4", 70, 3, 1, true, 95);
        Material material5 = new Metal("MATERIAL 5", 62, 2, 4, true, true);
    }
}