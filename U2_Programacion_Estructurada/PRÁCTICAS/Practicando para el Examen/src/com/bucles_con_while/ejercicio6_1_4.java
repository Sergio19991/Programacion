package com.bucles_con_while;

import java.util.Scanner;

public class ejercicio6_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un Número Entero:");
        num = sc.nextInt();

        while (num != 0) {
            System.out.println("El cuadrado de " + num + " es " + (num * num));
            System.out.println("Introduce un Número entero:");
            num = sc.nextInt();
        }
    }
}