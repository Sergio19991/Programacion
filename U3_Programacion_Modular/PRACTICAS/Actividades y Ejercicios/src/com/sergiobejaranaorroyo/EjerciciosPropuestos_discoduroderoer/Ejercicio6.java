package com.sergiobejaranaorroyo.EjerciciosPropuestos_discoduroderoer;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        int[] numeros = generarNumerosAleatoriosSinRepetir(1, 9, matriz.length * matriz[0].length);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = numeros[(matriz.length * i) + j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[] generarNumerosAleatoriosSinRepetir(int minimo, int maximo, int longitud) {
        if (maximo < minimo) {
            int aux = maximo;
            maximo = minimo;
            minimo = aux;
        }

        if ((maximo - minimo) >= (longitud - 1)) {

            int numero_elementos = 0;
            int numeros[] = new int[longitud];

            Arrays.fill(numeros, minimo - 1);

            boolean encontrado;

            int aleatorio;

            while (numero_elementos < longitud) {

                aleatorio = generaNumeroAleatorio(minimo, maximo);
                encontrado = false;

                for (int i = 0; i < numeros.length && !encontrado; i++) {
                    if (aleatorio == numeros[i]) {
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    numeros[numero_elementos++] = aleatorio;
                }
            }

            return numeros;

        } else {
            System.out.println("No se puede generar el arreglo, revusa los parametros");
            return null;
        }
    }

    public static int generaNumeroAleatorio(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}