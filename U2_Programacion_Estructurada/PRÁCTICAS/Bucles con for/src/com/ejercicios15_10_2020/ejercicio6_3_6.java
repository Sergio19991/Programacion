package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio6_3_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte altura, anchura;

        System.out.println("Introduce la Anchura:");
        anchura = sc.nextByte();
        System.out.println("Introduce la Altura:");
        altura = sc.nextByte();

        for (int i=0 ; i<altura ; i++) {
            for (int j=0 ; j<anchura ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
