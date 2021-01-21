package com.sergiobejaranoarroyo;

public class Caja {
    /*****************/
    /** ACTIVIDAD 7 **/
    /*****************/

    public enum Unidad {CM, M}

    protected final double ancho, alto, fondo;
    protected final Unidad unid;
    protected double volumen;
    public String etiqueta;

    public Caja(double ancho, double alto, double fondo, Unidad unid) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unid = unid;

        switch (unid) {
            case CM:
                volumen = (ancho / 100) * (alto / 100) * (fondo / 100);
                break;
            case M:
                volumen = ancho * alto * fondo;
                break;
        }
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        return ancho + "X" + alto + "X" + fondo + " " + unid.toString() + "\n" + etiqueta;
    }
}