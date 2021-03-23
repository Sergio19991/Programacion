package com.sergiobejaranoarroyo.PrimeraParte;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alturaIntroducida;
        int altura = 1;

        System.out.println("Introduce la Altura de la Pirámide:");
        alturaIntroducida = sc.nextInt();

        int espacios = alturaIntroducida - 1;

        while (altura <= alturaIntroducida) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i < altura; i++) {
                System.out.print(i);
            }

            for (int i = altura; i > 0; i--) {
                System.out.print(i);
            }

            System.out.println();

            altura++;
            espacios--;
        }
    }
}