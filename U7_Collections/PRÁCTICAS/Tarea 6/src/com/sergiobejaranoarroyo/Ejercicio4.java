package com.sergiobejaranoarroyo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> peones = new HashMap<>();
        int capturas;

        peones.put("dama", 9);
        peones.put("torre", 5);
        peones.put("alfil", 3);
        peones.put("caballo", 2);
        peones.put("peon", 1);

        capturas = (int) Math.random() * 15;

        System.out.println("Fichas capturadas por el jugador:");
        System.out.println("Alfil (");
        System.out.println("Caballo (");
        System.out.println("Peón (");
        System.out.println("Torre (");
        System.out.println("Peón (");
        System.out.println("Puntos totales: " + " peones.");
    }
}