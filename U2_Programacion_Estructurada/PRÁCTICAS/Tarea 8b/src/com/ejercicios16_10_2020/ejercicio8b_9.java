package com.ejercicios16_10_2020;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio8b_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, i, j;

        System.out.println("Introduce la Altura de la L:");
        altura = sc.nextInt();

        for (i=0 ; i<altura ; i++) {
            if (i<altura-1) {
                System.out.println("*");
            } else {
                for (j=0 ; j<altura/2+1 ; j++) {
                    System.out.print("* ");
                }
            }
        }
    }
}
