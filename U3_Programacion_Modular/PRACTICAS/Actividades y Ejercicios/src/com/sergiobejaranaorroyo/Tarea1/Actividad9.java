package com.sergiobejaranaorroyo.Tarea1;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un Número:");
        num = sc.nextInt();

        divisoresPrimos(num);
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void divisoresPrimos(int num) {
        System.out.println("Divisores primos de " + num);
        for (int i = 1; i <= num; i++) {
            if (esPrimo(i) && num % i == 0) {
                System.out.println("El número " + i);
            }
        }
    }

}