package com.sergiobejaranoarroyo;

public class Terminal {
    /*****************/
    /** EJERCICIO 8 **/
    /*****************/

    protected String numero;

    public Terminal(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void llama(Terminal numero, double segundos) {
        System.out.println("El Termina " + numero + " ha realizado una llamada de " + segundos + " Segundos.");
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "numero='" + numero + '\'' +
                '}';
    }
}