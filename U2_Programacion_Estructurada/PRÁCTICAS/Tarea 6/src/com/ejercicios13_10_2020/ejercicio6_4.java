package com.ejercicios13_10_2020;

import java.util.Scanner;

public class ejercicio6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num1, num2, menor;

        System.out.println("Introduce el Pimer Número:");
        num1 = sc.nextByte();
        System.out.println("Introduce el Segundo Núnmero:");
        num2 = sc.nextByte();

           // Solución haciendo uso de "if":
        if (num1>num2) {
            menor = num2;
        } else {
            menor = num1;
        }

           // Solución haciendo uso de "operador condicional":
        menor = (num1>num2) ? num1 : num2;
        System.out.println(menor + " es el Mayor.");
    }
}
