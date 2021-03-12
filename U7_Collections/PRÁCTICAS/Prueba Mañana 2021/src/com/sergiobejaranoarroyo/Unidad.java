package com.sergiobejaranoarroyo;

import java.io.*;
import java.util.*;

public class Unidad {
    private String nombre;
    private Map<String, Set<Alumno>> alumnos;

    public Unidad(String nombre) {
        this.nombre = nombre;
        alumnos = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, Set<Alumno>> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Map<String, Set<Alumno>> alumnos) {
        this.alumnos = alumnos;
    }

    /*public void mostrarTodosAlumnosOrdenados(String apellido) {
        if (!alumnos.containsKey(apellido)) {
            System.out.println("No existen Alumnos con estos Apellidos.");
        } else {
            List<Alumno> lista = new ArrayList<>(alumnos.get(apellido));

            Collections.sort(lista, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno alumno, Alumno t1) {
                    return t1.getApellidos() - alumno.getApellidos();
                }
            });
        }
    }*/

    /*public void obtenerUnidadAlumno(int id) {
        Collection<Set<Alumno>> conjunto = alumnos.values();

        Iterator it = conjunto.iterator();

        while (it.hasNext()) {
            Set<Alumno> alumnos = (Set<Alumno>) it.next();

            for (Alumno a : alumnos) {
                if (a.getAlumno().getId == id) {
                    System.out.println(a);
                }
            }
        }
    }*/

    public void mostrarAlumnosUnidad(String unidad) {
        if (!alumnos.containsKey(unidad)) {
            System.out.println("No hay Alumnos esta Unidad");
        } else {
            System.out.println(alumnos.get(unidad));
        }
    }

    /*public void addAulumnoUnidad(String nombreAlumno, String unidad) {
        if (unidad.getUnidad().equals(nombreAlumno)) {
            if (!alumnos.containsKey(unidad)) {
                alumnos.put(unidad, new TreeSet<Alumno>());
            }
        } else {
            System.out.println();
        }
    }*/

    /*public void cargarAlumnos() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));

            while (true) {
                Alumno a = (Alumno) ois.readObject();
                addAulumnoUnidad(a.getNombre(), a);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }*/

    public void guardarAlumnos() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));

            Collection<Set<Alumno>> conjunto = alumnos.values();

            Iterator it = conjunto.iterator();

            while (it.hasNext()) {
                Set<Alumno> alumnos = (Set<Alumno>) it.next();

                for (Alumno a : alumnos) {
                    oos.writeObject(a);
                }
            }

            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Unidad: " + nombre + "\n" +
                "Alumnos: " + alumnos;
    }
}