package com.entregable_1920;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, exponente, digito;
        double binario;

        System.out.println("Introduce un Número Entero Positivo para pasarlo a Binario:");
        numero = sc.nextInt();

        exponente = 0;
        binario = 0;

        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exponente);
            exponente++;
            numero = numero / 2;
        }

        System.out.printf("Binario: %.0f %n", binario);
    }
}