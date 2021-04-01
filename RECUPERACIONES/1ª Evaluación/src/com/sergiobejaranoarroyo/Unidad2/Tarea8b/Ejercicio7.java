package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, retorno = 0, digito;

        System.out.print("Introduce un Número: ");
        numero = sc.nextInt();
        System.out.println();

        while (numero > 0) {
            digito = numero % 10;
            numero = numero - digito;
            numero = numero / 10;
            retorno = retorno * 10 + digito;
        }

        System.out.println(retorno);
    }
}