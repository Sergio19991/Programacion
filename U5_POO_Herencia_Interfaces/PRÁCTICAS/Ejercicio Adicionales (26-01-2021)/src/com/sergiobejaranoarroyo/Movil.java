package com.sergiobejaranoarroyo;

public class Movil extends Terminal {
    /*****************/
    /** EJERCICIO 9 **/
    /*****************/

    Tarifa tarifas;

    public Movil(String numero, Tarifa tarifas) {
        super(numero);
        this.tarifas = tarifas;
    }

    public Tarifa getTarifas() {
        return tarifas;
    }

    public void setTarifas(Tarifa tarifas) {
        this.tarifas = tarifas;
    }

    public double costeTarifa() {
        switch (this.tarifas) {
            case RATA:
                return 0.6;
            case MONO:
                return 0.12;
            default:
                return 0.30;
        }
    }

    public void costeLlamada(Terminal numero, double segundos) {
        System.out.println("El coste de la llamada es de " + segundos * costeTarifa());
    }

    @Override
    public String toString() {
        return "Móvil: " + numero + "\n" +
                "Tarifa: " + getTarifas() + "\n" +
                "Coste: " + costeTarifa() * costeTarifa();
    }
}