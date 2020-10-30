package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos, incrementar, sumar;

        System.out.print("Introduzca horas: ");
        horas = sc.nextInt();
        System.out.print("Introduzca minutos: ");
        minutos = sc.nextInt();
        System.out.print("Introduzca segundos: ");
        segundos = sc.nextInt();
        System.out.print("Introduzca segundos a incrementar: ");
        incrementar = sc.nextInt();

        if (segundos >= 59) {   //Supera el límite de Segundos (59 segundos).
            for (sumar = 0; sumar < incrementar; sumar++) {
                System.out.println(horas + ":" + (minutos + sumar) + ":00");
            }
        } else if (minutos >= 59) {   //Supera el límite de Minutos (59 minutos).
            for (sumar = 0; sumar < incrementar; sumar++) {
                System.out.println((horas + sumar) + ":00:" + (segundos + sumar));
            }
        } else if (horas > 23) {
            for (sumar = 0; sumar < incrementar; sumar++) { //Super el límite de Horas (23h).
                System.out.println("00:" + (minutos + sumar) + ":" + (segundos + sumar));
            }
        } else {
            for (sumar = 0; sumar < incrementar; sumar++) { //No supera ninguna de las restricciones anteriores.
                System.out.println((horas + sumar) + (minutos + sumar) + ":" + (segundos + sumar));
            }
        }
    }
}