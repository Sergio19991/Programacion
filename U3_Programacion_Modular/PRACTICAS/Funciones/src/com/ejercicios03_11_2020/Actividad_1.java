package com.ejercicios03_11_2020;

import java.util.Scanner;

public class Actividad_1 {
    public static void main(String[] args) {

        eco(6);
        mostrarEntero(10, 20);
        cilindro(9,5,9);

    }
    public static void eco(int n) {
        for (int i=0 ; i<n ; i++) {
            System.out.println("Eco...");
        }
    }

    public static void mostrarEntero(int a, int b) {
        for (int i=a ; i<=b ; i++) {
            System.out.println(i);
        }
    }

    public static double cilindro(int tipo, double radio, double altura) {
        if (tipo==1) {
            System.out.println("El área es " + 2*Math.PI*radio*(altura+radio));
            return 2*Math.PI*radio*(altura+radio);
        } else if (tipo==2) {
            System.out.println("El volumen es " + Math.PI*radio*radio*altura);
            return Math.PI*radio*radio*altura;
        } else {
            System.out.println("ERROR");
            return 0;
        }
    }
}
