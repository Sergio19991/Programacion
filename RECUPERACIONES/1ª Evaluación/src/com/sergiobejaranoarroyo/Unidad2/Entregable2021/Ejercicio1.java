package com.sergiobejaranoarroyo.Unidad2.Entregable2021;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.print("Introduzca la altura de los calcetines: ");
        altura = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= altura - 2; i++) {
            System.out.println("***   ***");
        }
        System.out.println("****** ******");
        System.out.println("****** ******");
    }
}