package com.sergiobejaranoarroyo;

import java.util.*;

public class Instituto {
    private String nombre;
    private Map<String, ArrayList<Alumno>> listaUnidades = new HashMap<>();

    public Instituto(String nombre) {
        this.nombre = nombre;
        listaUnidades = new TreeMap<>();
    }

    public boolean addAlumno(String unidad, Alumno a) {
        if (a.getUnidad().equals(unidad)) {
            if (!listaUnidades.containsKey(unidad)) {
                listaUnidades.put(unidad, new ArrayList<>());
            }

            if (!listaUnidades.get(unidad).contains(a)) {
                listaUnidades.get(unidad).add(a);
            } else {
                return false;
            }
        }

        return false;
    }

    public void mostrarAlumnosUnidad(String unidad) {
        if (listaUnidades.containsKey(unidad)) {
            System.out.println(listaUnidades.get(unidad));

            ArrayList<Alumno> alumnos = new ArrayList<>(listaUnidades.get(unidad));
            Collections.sort(alumnos, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno o1, Alumno o2) {
                    return o1.getDni().compareTo(o2.getDni());
                }
            });

            System.out.println(alumnos);
        } else {
            System.out.println("Esa Unidad no existe.");
        }
    }

    public void mostrarTodosAlumnosOrdenados(String apellidos) {
        if (!listaUnidades.containsKey(apellidos)) {
            System.out.println("No existen alumnos con estos apellidos.");
        } else {
            List<Alumno> lista = new ArrayList<>(listaUnidades.get(apellidos));

            Collections.sort(lista, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno alumno, Alumno t1) {
                    return t1.getId() - alumno.getId();
                }
            });
        }
    }

    public void addAlumnoUnidad(String nombreAlumno, String unidad) {
        if (listaUnidades.get(listaUnidades).equals(nombreAlumno)) {
            if (!listaUnidades.containsKey(unidad)) {
                listaUnidades.put(unidad, new ArrayList<>());
            }
        }
    }
}