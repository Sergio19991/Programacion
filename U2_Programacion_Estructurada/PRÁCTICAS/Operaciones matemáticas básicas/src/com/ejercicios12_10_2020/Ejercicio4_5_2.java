package com.ejercicios12_10_2020;

    /*
        Crea un programa que pida al usuario su año de nacimiento y el año actual (suando datos de tipo short) y halle la diferencia de ambos para obtener su edad.
     */

import java.util.Scanner;

public class Ejercicio4_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu Año de Nacimiento:");
        short ano_nacimiento = sc.nextShort();
        System.out.println("Introduce el Año Actual:");
        short ano_actual = sc.nextShort();
        System.out.println("Si nacistes en el año " + ano_nacimiento + " y nos encontramos en el año " + ano_actual + ", entonces tu edad es de " + (ano_actual - ano_nacimiento) + " años.");
    }
}




     //Sergio Bejarano Arroyo.
