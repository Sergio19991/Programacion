package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minuto, segundo, incremento, i;

        System.out.println("Introduzca horas:");
        hora = sc.nextInt();
        System.out.println("Introduzca minutos:");
        minuto = sc.nextInt();
        System.out.println("Introduzca segundos:");
        segundo = sc.nextInt();
        System.out.println("Introduzca segundos a incrementar:");
        incremento = sc.nextInt();

        System.out.println(" ");

        System.out.println("Aumentando la hora...");
        for (i = 0; i < incremento; i++) {
            if (segundo < 59) {
                segundo++;
            } else {
                segundo = 0;
                minuto++;
            }
            if (minuto >= 60) {
                hora++;
                minuto = 0;
            }
            if (hora > 24) {
                hora = 0;
            }
            if (minuto < 10 && segundo < 10) {
                System.out.println(hora + ":0" + minuto + ":0" + segundo);
            } else if (minuto < 10) {
                System.out.println(hora + ":0" + minuto + ":" + segundo);
            } else if (segundo < 10) {
                System.out.println(hora + ":" + minuto + ":0" + segundo);
            } else {
                System.out.println(hora + ":" + minuto + ":" + segundo);
            }
        }
    }
}
