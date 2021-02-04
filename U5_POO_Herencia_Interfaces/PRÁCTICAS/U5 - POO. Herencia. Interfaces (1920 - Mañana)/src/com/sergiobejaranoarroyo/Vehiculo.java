package com.sergiobejaranoarroyo;

public class Vehiculo {
    protected String nombreVehiculo;
    protected int numeroPersonas;

    public Vehiculo(String nombreVehiculo, int numeroPersonas) {
        this.nombreVehiculo = nombreVehiculo;
        this.numeroPersonas = numeroPersonas;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombreVehiculo='" + nombreVehiculo + '\'' +
                ", numeroPersonas=" + numeroPersonas +
                '}';
    }
}