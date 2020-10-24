package com.ejercicios12_10_2020;

    /*
        Crea un programa que calcule y muestre la suma de dos números de dos cifras (de tipo byte) que introduzca el usuario.
     */

import java.util.Scanner;

public class Ejercicio4_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Primer Número:");
        int num1 = sc.nextByte();
        System.out.println("Introduce el Segundo Número:");
        int num2 = sc.nextByte();
        System.out.println("El resultado de Sumar " + num1 + " más " + num2 + " es " + (num1 + num2) + ".");
    }
}




     //Sergio Bejarano Arroyo.