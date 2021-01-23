package com.sergiobejaranoarroyo;

public class CajaCarton extends Caja {
    /*****************/
    /** ACTIVIDAD 8 **/
    /*****************/

    int etiqueta;
    static double cartonTotal = 0;
    protected double area;

    CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, Unidad.CM);
        area = 2 * (ancho * alto + ancho * fondo + alto * fondo);
        cartonTotal += area;
    }

    double getArea() {
        return area;
    }

    @Override
    public double getVolumen() {
        return volumen * 0.8;
    }

    @Override
    public String toString() {
        String result = "Cartón Total: " + cartonTotal + " cm2\n";
        result += "Área: " + area + " cm2\n";
        result += super.toString();
        return result;
    }
}