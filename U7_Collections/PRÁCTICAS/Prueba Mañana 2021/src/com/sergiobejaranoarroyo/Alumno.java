package com.sergiobejaranoarroyo;

import java.io.Serializable;

public class Alumno implements Comparable, Serializable {
    private String nombre;
    private String apellidos;
    private String dni;
    private int id;
    private static int idAlumno;
    private Unidad unidad;

    public Alumno(String nombre, String apellidos, String dni, int id, Unidad unidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.id = Alumno.idAlumno;
        Alumno.idAlumno++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdAlumno() {
        return idAlumno;
    }

    public static void setIdAlumno(int idAlumno) {
        Alumno.idAlumno = idAlumno;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    /*@Override
    public int compareTo(Object o) {
        Alumno a = (Alumno) o;
        return a.getApellidos() - getApellidos();
    }*/

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "DNI: " + dni + "\n" +
                "ID: " + id + "\n" +
                "ID del Alumno: " + idAlumno + "\n" +
                "Unidad: " + unidad;
    }
}