package com.sergiobejaranaorroyo.Tarea3;

import java.util.Arrays;

public class Actividad6 {
    public static void main(String[] args) {
        int[] sin;
        int[] con = {1, 2, 3, 2, 1, 3, 4, 2, 3, 5};
        sin = sinRepetidos(con);
        System.out.println(Arrays.toString(sin));
    }

    public static int[] sinRepetidos(int[] t) {
        int[] copia = Arrays.copyOf(t, t.length);
        int numElem = copia.length;
        int i = 0;

        while (i < numElem) {
            int aBuscar = copia[i];
            int j = 0;

            while (j < i && copia[j] != aBuscar) {
                j++;
            }

            if (j < i) {
                copia[i] = copia[numElem - 1];
                numElem--;
            } else {
                i++;
            }
        }

        return Arrays.copyOf(copia, numElem);
    }

}