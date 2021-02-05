package com.sergiobejaranoarroyo;

public class Pico extends Material implements Minar {
    private int grosor;

    public Pico(String nombre, int masa, int capacidadQuemarse, int capacidadDiluirse, boolean movible, int grosor) {
        super(nombre, masa, capacidadQuemarse, capacidadDiluirse, movible);
        this.grosor = grosor;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public void Hacer(Material material) {
        //material.getMasa() + 100;
    }

    @Override
    public void Deshacer(Material material) {
        //material.getMasa() - 100;
    }

    @Override
    public String toString() {
        return "Grosor: " + grosor + " milímetros.";
    }
}