package com.ejercicios12_10_2020;

    /*
        Crea un programa que calcule y muestre la división de dos números reales de doble precisión introducidos por el usuario.
     */

import java.util.Scanner;

public class Ejercicio4_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce en Dividendo:");
        double dividendo = sc.nextDouble();
        System.out.println("Introduce el Divisor:");
        double divisor = sc.nextDouble();
        System.out.println("El resultado de Dividir " + dividendo + " entre " + divisor + " es " + dividendo / divisor + ".");
    }
}




     //Sergio Bejarano Arroyo.
