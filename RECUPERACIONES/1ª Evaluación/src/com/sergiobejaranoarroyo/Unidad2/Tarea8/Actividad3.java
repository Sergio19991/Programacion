package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio, numeroUsuario = 0;

        numeroAleatorio = (int) (Math.random() * (100 - 0) + 1);

        /** Muestra el Resultado del Número Aleatorio (deshabilitar el Código comentado): **/
        /*System.out.println("Número Aleatorio: " + numeroAleatorio + "\n");*/

        System.out.println("Adivina el Número Aleatorio. (Si te rindes escribe -1):" + "\n");

        while (numeroUsuario != -1) {
            System.out.println();

            System.out.print("Introduce un Número: ");
            numeroUsuario = sc.nextInt();

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("mayor");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("menor");
            } else {
                System.out.println();
                System.out.println("¡¡¡ HAS ACERTADO !!!");
                break;
            }
        }
    }
}