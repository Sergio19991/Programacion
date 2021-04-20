package com.sergiobejaranoarroyo;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
        this.nombre = null;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public void setEdad(int edad) {
        edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}