package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio6_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, password;

        password = 1234;

        System.out.println("Introduce la Contraseña:");
        num = sc.nextInt();

        while (num!=password) {
            System.out.println("¡ERROR! Vuelve a introducir la Contraseña:");
            num = sc.nextInt();
        }

        System.out.println("¡CORRECTO! Has entrado en el Sistema:");
    }
}
