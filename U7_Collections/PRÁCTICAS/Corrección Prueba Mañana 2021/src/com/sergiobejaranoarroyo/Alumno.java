package com.sergiobejaranoarroyo;

import java.util.Objects;

public class Alumno implements Comparable {
    private String nombre;
    private String apellidos;
    private String dni;
    private static int generadorId = 1;
    private int id;
    private String unidad;

    public Alumno(String nombre, String apellidos, String dni, String unidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.unidad = unidad;
        this.id = Alumno.generadorId;
        Alumno.generadorId++;
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

    public static int getGeneradorId() {
        return generadorId;
    }

    public static void setGeneradorId(int generadorId) {
        Alumno.generadorId = generadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", id=" + id +
                ", unidad='" + unidad + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return dni.equals(alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo(Alumno o) {
        return this.apellidos.compareTo(o.getApellidos());
    }
}