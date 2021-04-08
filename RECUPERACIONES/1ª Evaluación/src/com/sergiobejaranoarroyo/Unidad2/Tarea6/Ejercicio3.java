package com.sergiobejaranoarroyo.Unidad2.Tarea6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, par;

        System.out.print("Introduce un Número: ");
        numero = sc.nextInt();
        System.out.println();

        /** Con "if": **/
        if (numero % 2 == 0) {
            par = 1;
        } else {
            par = 0;
        }

        System.out.println("Valor de par (if): " + par);


        System.out.println();


        /** Con "operador condicional": **/
        par = (numero % 2 == 0) ? 1 : 0;

        System.out.println("Valor de par (operador condicional): " + par);
    }
}