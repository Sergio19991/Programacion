package com.ejercicios16_10_2020;

import java.util.Scanner;

public class ejercicio8b_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinacion, respuesta, i, intentos;

        combinacion = 1234;   //Esta es la contraseña. Pero esta vez el Ejercicio me pide que sea 1234. Se puede cambiar al gusto.

        System.out.println("Introduce la Combinación:");
        respuesta = sc.nextInt();

        for (i=2; i<=4 ; i++) {
            if (respuesta!=combinacion) {
                System.out.println(" ");  //Esta línea la he metido para hacer un espacio. (Estética de cara al Usuario)
                System.out.println("Lo siento, esa no es la combinación");
                System.out.println("Introduce la Combinación:");
                respuesta = sc.nextInt();
            }
        }

        if (respuesta==combinacion) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        }

        /**OTRA POSIBLE SOLUCIÓN:**/

        /*combinacion = 1234;
        intentos = 0;

        do {
            System.out.println("Introduzca el número");
            respuesta = sc.nextInt();
            intentos++;
        } while (combinacion!=respuesta && intentos<4);

        if (combinacion==respuesta) {
            System.out.println("Has acertado");
        } else {
            System.out.println("Has consumido todos los intentos");
        }*/
    }
}
