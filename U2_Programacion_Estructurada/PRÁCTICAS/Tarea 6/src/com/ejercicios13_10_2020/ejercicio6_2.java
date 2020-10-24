package com.ejercicios13_10_2020;

import java.util.Scanner;

public class ejercicio6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número entre 1 y 10");
        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("diez");
                break;
            default:
                System.out.println("Número fuera de rango.");
        }
    }
}
