package com.sergiobejaranoarroyo;

public class Metal extends Material implements Mezclar {
    private boolean inmantable;

    public Metal(String nombre, int masa, int capacidadQuemarse, int capacidadDiluirse, boolean movible, boolean inmantable) {
        super(nombre, masa, capacidadQuemarse, capacidadDiluirse, movible);
        this.inmantable = false;
    }

    public boolean isInmantable() {
        return inmantable;
    }

    public void setInmantable(boolean inmantable) {
        this.inmantable = inmantable;
    }

    @Override
    public void mezclarConMaterial(Material material) {
        System.out.println("Metal de ópalo");
    }

    @Override
    public String toString() {
        return "¿Es Inmantable? " + inmantable;
    }
}