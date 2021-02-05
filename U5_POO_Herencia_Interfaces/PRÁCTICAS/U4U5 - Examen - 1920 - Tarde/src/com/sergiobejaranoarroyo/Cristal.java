package com.sergiobejaranoarroyo;

public class Cristal extends Material implements Mezclar {
    Tipo tipoCristal;

    public Cristal(String nombre, int masa, int capacidadQuemarse, int capacidadDiluirse, boolean movible, Tipo tipoCristal) {
        super(nombre, masa, capacidadQuemarse, capacidadDiluirse, movible);
        this.tipoCristal = tipoCristal;
    }

    public Tipo getTipoCristal() {
        return tipoCristal;
    }

    public void setTipoCristal(Tipo tipoCristal) {
        this.tipoCristal = tipoCristal;
    }

    @Override
    public void mezclarConMaterial(Material material) {
        System.out.println("Cristal de ópalo");
    }

    @Override
    public String toString() {
        return "Tipo de Cristal: " + tipoCristal;
    }
}