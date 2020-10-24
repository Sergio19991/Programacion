package com.ejercicios13_10_2020;

import java.util.Scanner;

public class ejercicio6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double radio;

        System.out.println("Introduce el Radio de la circunferencia:");
        radio = sc.nextDouble();
        sc.nextLine(); //Sirve para que se pueda leer carácteres después de números:

        System.out.println("Introduce la Opción:");
        System.out.println("        1 - Calcular el Diámetro:");
        System.out.println("        2 - Calcular el Perímetro:");
        System.out.println("        3 - Calcular el Área:");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("diámetro = " + (2*radio));
                break;
            case 2:
                System.out.println("perímetro = " + (2*3.14*radio));
                break;
            case 3:
                System.out.println("área = " + (3.14*radio*radio));
                break;
            default:
                System.out.println("No has elegido Ninguna Opción.");
        }
    }
}
