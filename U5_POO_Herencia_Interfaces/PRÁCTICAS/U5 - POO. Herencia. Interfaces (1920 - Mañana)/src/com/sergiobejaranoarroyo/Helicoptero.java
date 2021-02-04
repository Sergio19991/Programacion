package com.sergiobejaranoarroyo;

public class Helicoptero extends Aereo {
    protected int altitud;
    protected String codigoOACI;

    public Helicoptero(String nombre, int numeroPersonas, int altitud, String codigoOACI) {
        super(nombre, numeroPersonas);
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

    public String tipoAeronave() {
        return "HELICOPTERO";
    }

    @Override
    public String toString() {
        return "Tipo de Aeronave: " + tipoAeronave() + "\n" + "Código OACI: " + codigoOACI;
    }
}