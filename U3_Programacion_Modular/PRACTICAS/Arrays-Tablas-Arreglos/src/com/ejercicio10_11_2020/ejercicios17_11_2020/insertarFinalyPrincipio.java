/**package com.ejercicio10_11_2020.ejercicios17_11_2020;

public class insertarFinalyPrincipio {
    public static void main(String[] args) {

    }

    public static int insertarPosicion (int[]vector, int posicion, int numero) {
        int i;
        int[] resultado= new int[vector.length+1];

        for (i=0 ; i<vector.length ; i++) {
            if (i<posicion) {
                resultado[i] = vector[i];
            } else if (i==posicion) {
                resultado[i]=numero;
            } else {
                resultado[i]=vector[i-1];
            }
        }

        resultado[resultado.length-1] = vector[vector.length-1];
        return resultado;
    }

    public static int insertarPrincipio (int[]v, int num) {
        int[] resultado = new int[v.length+1];

        resultado[0]=num;

        for (int i = 0; i < v.length; i++) {
            resultado[i+1] = v[i];
        }

        return resultado;
    }
}
 **/
