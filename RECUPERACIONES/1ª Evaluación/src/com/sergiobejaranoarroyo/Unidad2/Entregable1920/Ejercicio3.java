package com.sergiobejaranoarroyo.Unidad2.Entregable1920;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digito, exponente = 0;
        double binario = 0;

        System.out.print("Introduce un Número: ");
        numero = sc.nextInt();

        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exponente);
            exponente++;
            numero = numero / 2;
        }

        System.out.printf("\nBinario: %.0f %n", binario);
    }
}