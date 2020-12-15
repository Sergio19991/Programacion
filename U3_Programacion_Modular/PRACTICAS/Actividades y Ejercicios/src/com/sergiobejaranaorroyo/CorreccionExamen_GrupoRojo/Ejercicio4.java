package com.sergiobejaranaorroyo.CorreccionExamen_GrupoRojo;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[][] tabla1 = {
                {"HOLA", "PERRO", "C++"},
                {"ADIOS", "GATO", "PYTHON"},
                {"HASTA", "LUEGO", "VACA", "JAVA"}
        };

        String[][] tabla2 = {
                {"BD", "SOBRESALIENTE", "PEPE"},
                {"LM", "NOTABLE", "MANUEL"},
                {"PROG", "APROBADO", "ROSA"}
        };

        String[][] v = unirMAtrices(tabla1, tabla2);

        for (String[] fila : v) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static String[][] unirMAtrices(String[][] m1, String[][] m2) {
        String[][] resultado = new String[0][0];

        if (m1.length == m2.length && m1[0].length == m2[0].length) {

            resultado = new String[m1.length][m1[0].length * 2];

            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    resultado[i][j] = m1[i][j];
                }
            }

            for (int i = 0; i < m2.length; i++) {
                for (int j = 0; j < m2[i].length; j++) {
                    resultado[i][j + m1[i].length] = m2[i][j];
                }
            }

            return resultado;
        } else {
            return resultado;
        }
    }

}