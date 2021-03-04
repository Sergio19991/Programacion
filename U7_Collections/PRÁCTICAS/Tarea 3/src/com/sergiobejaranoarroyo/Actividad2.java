package com.sergiobejaranoarroyo;

import java.util.*;

public class Actividad2 {
    public static void main(String[] args) {
        Map<Integer, String> personas = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String dni;

        personas.put(calularClave("111111111A"), "Pepe Pérez");
        System.out.println(personas);

        System.out.println();

        System.out.print("Dime el DNI: ");
        dni = sc.nextLine();

        if (personas.get(calularClave(dni)) == null) {
            System.out.println("No existe esa persona en el Mapa.");
        } else {
            System.out.println(personas.get(calularClave(dni)));
        }
    }

    public static int calularClave(String dni) {
        int resultado = 0;

        for (int i = 0; i < dni.length() - 1; i++) {
            resultado += Integer.parseInt(String.valueOf(dni.charAt(i)));
        }

        return resultado;
    }
}