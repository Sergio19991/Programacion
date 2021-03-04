package com.sergiobejaranoarroyo;

import java.util.*;

public class Actividad3 {
    public static void main(String[] args) {
        Map<Integer, String> personas = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String dni;

        personas.put(calularClave("11111111A"), "Pepe Pérez");
        System.out.println(personas);

        System.out.println();

        System.out.print("Dime el DNI: ");
        dni = sc.nextLine();

        if (personas.get(calularClave(dni)) == null) {
            System.out.println("No existe esa persona en el Mapa.");
        } else {
            System.out.println(personas.get(calularClave(dni)));
        }

        System.out.println();

        Set<Map.Entry<Integer, String>> people = personas.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = people.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> p = iterator.next();
            System.out.println("La clave " + p.getKey() + " está asociada al nombre " + p.getValue() + ".");
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