package com.sergiobejaranoarroyo.Unidad2.Tarea6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario, par;

        System.out.print("Introduce un Número Entero: ");
        numeroUsuario = sc.nextInt();

        //Utilizando "if":
        if (numeroUsuario % 2 == 0) {
            par = 1;
        } else {
            par = 0;
        }

        System.out.println();
        System.out.println(par);


        //Utilizando "operador condicional":
        par = (numeroUsuario % 2 == 0) ? 1 : 0;

        System.out.println();
        System.out.println(par);
    }
}