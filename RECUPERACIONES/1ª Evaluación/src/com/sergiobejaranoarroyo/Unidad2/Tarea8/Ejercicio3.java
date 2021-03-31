package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario, numeroAleatorio;

        numeroAleatorio = (int) (Math.random() * 100 + 1);

        /*System.out.println(numeroAleatorio);*/

        System.out.println("Acierta el Número Aleatorio. (Si te rindes escribe -1):" + "\n");

        System.out.print("Introduce un Número: ");
        numeroUsuario = sc.nextInt();

        while (numeroUsuario != -1) {
            if (numeroUsuario > numeroAleatorio) {
                System.out.println("menor");
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("mayor");
            } else {
                System.out.println();
                System.out.println("¡¡¡ HAS ACERTADO !!!");
                break;
            }

            System.out.println();
            System.out.print("Introduce un Número: ");
            numeroUsuario = sc.nextInt();
        }
    }
}