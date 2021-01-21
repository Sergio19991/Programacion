package com.sergiobejaranoarroyo;

public class Caja {
    final double ancho;
    final double alto;
    final double fondo;
    protected String destinatario;
    Unidades u;

    public Caja(double ancho, double alto, double fondo, String destinatario, Unidades u) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.destinatario = destinatario;
        this.u = u;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getFondo() {
        return fondo;
    }

    double getVolumen() {
        return this.ancho * this.alto * this.fondo;
    }

    @Override
    public String toString() {
        return "DIMENSIONES; Alto: " + alto + ", Ancho: " + ancho + ", Fondo: " + fondo + ", Volumen: " + getVolumen();
    }
}