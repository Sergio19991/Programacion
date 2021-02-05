package com.sergiobejaranoarroyo;

public class Sierra extends Material {
    private int diametro;

    public Sierra(String nombre, int masa, int capacidadQuemarse, int capacidadDiluirse, boolean movible, int diametro) {
        super(nombre, masa, capacidadQuemarse, capacidadDiluirse, movible);
        this.diametro = diametro;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Diámetro: " + diametro;
    }
}