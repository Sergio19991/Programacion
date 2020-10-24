package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, nivel_de_estudios, ingresos;
        boolean jasp;

        edad = 27;
        nivel_de_estudios = 5;
        ingresos = 30000;

        jasp = (edad<=28 && nivel_de_estudios>3 && ingresos>28000) ? true : false;

        System.out.println(jasp);
    }
}
