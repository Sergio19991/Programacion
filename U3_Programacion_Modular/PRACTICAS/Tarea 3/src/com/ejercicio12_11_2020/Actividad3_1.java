package com.ejercicio12_11_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] numeros_decimales = new float[5]; //Habrá 5 números decimales.
        int i;   //Variable utuilizada en el bucle for.

        for (i = 0; i < numeros_decimales.length; i++) {   //Recorrerá tantas veces se haya declarado en la variable para los números decimales.
            System.out.println("Introduce Número Decimal:");
            numeros_decimales[i] = sc.nextFloat(); //Leerá un total de 5 veces, ya que es la cantidad que hemos introducido en la variable declara para los números decimales.
        }

        System.out.println(Arrays.toString(numeros_decimales));   //Especificamos que muestre esa cadena pedida más arriba.
    }
}