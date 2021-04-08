package com.sergiobejaranoarroyo.Unidad2.Tarea6;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte primerNumero, segundoNumero, menor;

        System.out.print("Introduce el Primero Número: ");
        primerNumero = sc.nextByte();
        System.out.print("Introduce el Segundo Número: ");
        segundoNumero = sc.nextByte();
        System.out.println();

        /** Con "if": **/
        if (primerNumero < segundoNumero) {
            menor = primerNumero;
        } else {
            menor = segundoNumero;
        }

        System.out.println("(if) El menor número es " + menor);


        System.out.println();


        /** Con "operador condicional": **/
        menor = (primerNumero < segundoNumero) ? primerNumero : segundoNumero;

        System.out.println("(operador condicional) El menor número es " + menor);
    }
}