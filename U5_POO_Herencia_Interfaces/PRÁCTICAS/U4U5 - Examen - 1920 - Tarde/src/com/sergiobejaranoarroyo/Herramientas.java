package com.sergiobejaranoarroyo;

public abstract class Herramientas extends Material {
    public Herramientas(String nombre, int masa, int capacidadQuemarse, int capacidadDiluirse, boolean movible) {
        super(nombre, masa, capacidadQuemarse, capacidadDiluirse, movible);
    }
}