package com.sergiobejaranoarroyo;

public class Ameba {
    /*****************/
    /** EJERCICIO 2 **/
    /*****************/
    protected int peso;

    public Ameba() {
        this.peso = 3;
    }

    public Ameba(int peso) {
        this.peso = 3;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void come(int comida) {
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + peso + " microgramos.";
    }
}