package com.sergiobejaranoarroyo;

public class Rocas extends Material implements Mezclar {
    private int dureza;

    public Rocas(String nombre, int masa, int capacidadQuemarse, int capacidadDiluirse, boolean movible, int dureza) {
        super(nombre, masa, capacidadQuemarse, capacidadDiluirse, movible);
        this.dureza = dureza;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    @Override
    public void mezclarConMaterial(Material material) {
        System.out.println("Roca de ópalo");
    }

    @Override
    public String toString() {
        return "Dureza: " + dureza;
    }
}