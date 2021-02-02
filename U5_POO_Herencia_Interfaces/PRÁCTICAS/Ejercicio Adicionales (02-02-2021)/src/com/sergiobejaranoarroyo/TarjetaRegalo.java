package com.sergiobejaranoarroyo;

public class TarjetaRegalo {
    /*****************/
    /** EJERCICIO 3 **/
    /*****************/

    protected double dinero;
    protected int numero;

    public TarjetaRegalo(double dinero, int numero) {
        this.dinero = dinero;
        this.numero = numero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void gasta(double dineroGastar) {
    }

    public void fusionaCon(double fusionar) {

    }

    @Override
    public String toString() {
        return "Tarjeta no " + numero + " - " + "Saldo " + dinero + "€";
    }
}