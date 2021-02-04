package com.sergiobejaranoarroyo;

public abstract class Aereo extends Vehiculo {
    enum Tipo {HELICOPTERO, AVIONETA}

    private Object Tipo;
    protected int altitud;
    protected String codigoOACI;

    public Aereo(String nombreVehiculo, int numeroPersonas, int altitud, String codigoOACI) {
        super(nombreVehiculo, numeroPersonas);
        this.altitud = altitud;
        this.codigoOACI = codigoOACI;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public String getCodigoOACI() {
        return codigoOACI;
    }

    public void setCodigoOACI(String codigoOACI) {
        this.codigoOACI = codigoOACI;
    }

    @Override
    public String toString() {
        return "Tipo: " + Tipo + ", Código OACI: " + codigoOACI;
    }
}