package com.sergiobejaranoarroyo.Ejercicio7_2;

import com.sergiobejaranoarroyo.Conjunto;

public class Main {

    public static void main(String[] args) {
        Calendario c1 = new Calendario(2011, 11, 11);
        Calendario c2 = new Calendario(1999, 2, 3);

        c2.incrementarDias(6);
        c2.incrementarMeses(1);

        System.out.println(c1);
        System.out.println(c2);
    }
}