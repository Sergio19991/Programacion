package com.sergiobejaranoarroyo.Unidad2.Tarea6;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte primerNumero, segundoNumero, menor;

        System.out.print("Introduce el Primer Número: ");
        primerNumero = sc.nextByte();
        System.out.print("Introduce el Segundo Número: ");
        segundoNumero = sc.nextByte();

        //Utilzando "if":
        if (primerNumero > segundoNumero) {
            menor = segundoNumero;
        } else {
            menor = primerNumero;
        }

        System.out.println();
        System.out.println(menor);


        //Utilizando "operador condicional":
        menor = (primerNumero > segundoNumero) ? segundoNumero : primerNumero;

        System.out.println();
        System.out.println(menor);
    }
}