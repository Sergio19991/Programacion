package com.ejercicios13_10_2020;

import java.util.Scanner;

public class ejercicio5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double gravedad = 9.8;   //final sirve para impedir que ese valor guardado en la variable se cambie
        double tiempo;

        System.out.println("Introduce el Tiempo:");
        tiempo = sc.nextDouble();

        if (tiempo<0) {
            System.out.println("Tiempo incorrecto.");
        } else {
            System.out.println("Velocidad=" + (gravedad*tiempo) + ".");
        }
    }
}
