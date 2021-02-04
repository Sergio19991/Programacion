package com.sergiobejaranoarroyo;

public abstract class Vehiculo {
    protected String nombre;
    protected int numeroPersonas;

    public Vehiculo(String nombre, int numeroPersonas) {
        this.nombre = nombre;
        this.numeroPersonas = numeroPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public void transportar(int nuevaPersona) {
        this.numeroPersonas += nuevaPersona;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", numeroPersonas=" + numeroPersonas +
                '}';
    }
}