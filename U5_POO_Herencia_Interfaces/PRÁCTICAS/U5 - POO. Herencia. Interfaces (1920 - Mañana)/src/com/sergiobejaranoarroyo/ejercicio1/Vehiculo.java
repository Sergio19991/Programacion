package com.sergiobejaranoarroyo.ejercicio1;

public class Vehiculo {
    protected String nombre;
    protected int numeroPersonas;
    Tipo tipoVehiculo;

    public Vehiculo(String nombre, int numeroPersonas, Tipo tipoVehiculo) {
        this.nombre = nombre;
        this.numeroPersonas = numeroPersonas;
        this.tipoVehiculo = tipoVehiculo;
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

    public Tipo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(Tipo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", numeroPersonas=" + numeroPersonas +
                ", tipoVehiculo=" + tipoVehiculo +
                '}';
    }
}