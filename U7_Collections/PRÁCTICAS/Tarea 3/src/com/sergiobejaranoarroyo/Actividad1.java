package com.sergiobejaranoarroyo;

import java.util.*;

public class Actividad1 {
    public static void main(String[] args) {
        Map<Integer, String> personas = new HashMap<>();
        String dni;

        personas.put(calularClave("11111111A"), "Pepe Pérez");

        System.out.println(personas);

    }

    public static int calularClave(String dni) {
        int resultado = 0;

        for (int i = 0; i < dni.length() - 1; i++) {
            resultado += Integer.parseInt(String.valueOf(dni.charAt(i)));
        }

        return resultado;
    }
}