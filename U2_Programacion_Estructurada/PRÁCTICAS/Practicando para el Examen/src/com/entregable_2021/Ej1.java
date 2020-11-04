package com.entregable_2021;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, i;

        System.out.println("Introduce la Altura de los Calcetines:");
        altura = sc.nextInt();

        while (altura < 4) {
            System.out.println("La Altura debe ser Mayor o Igual a 4.");
            System.out.println("Introduce la Altura de los Calcetines:");
            altura = sc.nextInt();
        }

        for (i = 0; i < altura - 2; i++) {
            System.out.println("***  ***");
        }
        System.out.println("******  ******");
        System.out.println("******  ******");
    }
}