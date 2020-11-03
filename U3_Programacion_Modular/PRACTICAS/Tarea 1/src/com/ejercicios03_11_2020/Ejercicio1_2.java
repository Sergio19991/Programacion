package com.ejercicios03_11_2020;

import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Entroduce el Primer Número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el Segundo Número:");
        num2 = sc.nextInt();

        System.out.println();   //Salto de línea. (Estética de cara al usuraio).

        numerosComprendidos(num1, num2);   //Llamada a la función numerosComprendidos();.

    }

    public static void numerosComprendidos(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }

}