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

    public void llama() {

    }

    @Override
    public String toString() {
        return "Terminal{" +
                "numero='" + numero + '\'' +
                '}';
    }
}