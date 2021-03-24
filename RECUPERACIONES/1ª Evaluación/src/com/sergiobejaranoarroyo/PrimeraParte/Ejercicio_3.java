package com.sergiobejaranoarroyo.PrimeraParte;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.print("Introduzca la altura de la U: ");
        altura = sc.nextInt();

        for (int i = 1; i < altura-1; i++) {
            System.out.println("*    *");

            for (int j = 0; j < altura+i; j++) {
                System.out.println(" * ");
            }
        }
    }
}
