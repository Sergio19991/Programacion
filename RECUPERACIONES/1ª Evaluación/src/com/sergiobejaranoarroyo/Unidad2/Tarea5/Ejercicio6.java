package com.sergiobejaranoarroyo.Unidad2.Tarea5;

import java.util.Scanner;

public class Ejercicio6 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GRAVEDAD = 9.8;
        
        System.out.print("Introduce el Tiempo: ");
        int tiempo = sc.nextInt();

        System.out.println();
        double velocidad = GRAVEDAD * tiempo;

        if (tiempo <= 0) {
            System.out.println("Tiempo incorrecto");
        } else {
            System.out.println(velocidad);
        }
    }
}