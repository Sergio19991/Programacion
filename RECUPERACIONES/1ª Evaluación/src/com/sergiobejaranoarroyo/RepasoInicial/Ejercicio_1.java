package com.sergiobejaranoarroyo.RepasoInicial;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alturaUsuario;

        System.out.println("¿ALTURA?");
        alturaUsuario = sc.nextInt();

        for (int i = 0; i < alturaUsuario; i++) {
            for (int j = 0; j < (alturaUsuario*2)-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
