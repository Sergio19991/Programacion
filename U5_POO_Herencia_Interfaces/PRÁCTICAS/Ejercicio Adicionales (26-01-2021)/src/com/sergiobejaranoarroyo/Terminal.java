package com.sergiobejaranoarroyo;

public class Terminal {
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

    public void llama(Terminal terminal, int segundos) {
        System.out.println("El Terminal " + terminal + " ha realizado una llamada de " + segundos + " Segundos.");
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "numero='" + numero + '\'' +
                '}';
    }
}