package com.sbejarano;

import java.util.Scanner;

public class Diferencias_anos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short ano_nacimiento, ano_actual;

        System.out.println("Introduce tu Año de Nacimiento:");
        ano_nacimiento = sc.nextShort();
        System.out.println("Introduce el Año Actual:");
        ano_actual = sc.nextShort();

        System.out.println("Si nacistes en el año " + ano_nacimiento + " y estamos en el año " + ano_actual + ", etonces tu edad debe ser de " + (ano_actual-ano_nacimiento) + " años.");
    }
}
