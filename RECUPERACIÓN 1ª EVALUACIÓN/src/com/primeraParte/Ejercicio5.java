package com.primeraParte;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short contadorPrimos = 0;
        int num;

        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.nextInt();

        for (int i = 0; i < (num + 1); i++) {
            if ((i % 2 != 0 && i != 1) || (i == 2)) {
                contadorPrimos++;
            }
        }

        System.out.println(contadorPrimos);
    }
}