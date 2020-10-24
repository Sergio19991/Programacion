package com.ejercicios09_10_2020;

import java.util.Scanner;

public class ejercicio3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short ano_nacimiento, ano_actual;

        System.out.println("Introduce tu Año de Nacimiento:");
        ano_nacimiento = sc.nextShort();
        System.out.println("Introduce el Año Actual:");
        ano_actual = sc.nextShort();

        System.out.println("Si naciste en el año " + ano_nacimiento + " y nos encotramos en el año " + ano_actual + ", tu edad es de " + (ano_actual-ano_nacimiento) + " años.");
    }
}
