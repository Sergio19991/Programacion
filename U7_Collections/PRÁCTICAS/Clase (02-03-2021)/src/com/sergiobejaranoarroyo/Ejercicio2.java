package com.sergiobejaranoarroyo;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] valores = {"AS", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        List cartas = new ArrayList<Carta>();

        while (cartas.size() < 11) {
            String v = valores[(int) (Math.random() * 10)];
            String p = palos[(int) (Math.random() * 4)];
            Carta c = new Carta(v, p);

            if (!cartas.contains(c)) {
                cartas.add(c);
            }
        }

        System.out.println(cartas);
    }
}