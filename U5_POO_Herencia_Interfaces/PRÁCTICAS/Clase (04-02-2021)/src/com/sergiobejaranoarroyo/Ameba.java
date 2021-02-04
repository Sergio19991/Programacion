package com.sergiobejaranoarroyo;

public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void come(int pesoParticula) {
        peso = peso - 1 + pesoParticula;
    }

    public void come(Ameba amebaAComer) {
        peso = peso - 1 + amebaAComer.getPeso();
        amebaAComer.setPeso(0);
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + peso + " microgramos.";
    }
}