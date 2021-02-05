package com.sergiobejaranoarroyo;

public abstract class Material implements Comparable {
    protected String nombre;
    protected int masa;
    protected int capacidadQuemarse;
    protected int capacidadDiluirse;
    protected boolean movible;

    public Material(String nombre, int masa, int capacidadQuemarse, int capacidadDiluirse, boolean movible) {
        this.nombre = nombre;
        this.masa = masa;
        this.capacidadQuemarse = capacidadQuemarse;
        this.capacidadDiluirse = capacidadDiluirse;
        this.movible = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getCapacidadQuemarse() {
        return capacidadQuemarse;
    }

    public void setCapacidadQuemarse(int capacidadQuemarse) {
        this.capacidadQuemarse = capacidadQuemarse;
    }

    public int getCapacidadDiluirse() {
        return capacidadDiluirse;
    }

    public void setCapacidadDiluirse(int capacidadDiluirse) {
        this.capacidadDiluirse = capacidadDiluirse;
    }

    public boolean isMovible() {
        return movible;
    }

    public void setMovible(boolean movible) {
        this.movible = movible;
    }

    @Override
    public int compareTo(Object o) {
        return getMasa() - ((Material) o).getMasa();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Masa: " + masa + "\n" +
                "Capacidad de Quemarse: " + capacidadQuemarse + "\n" +
                "Capacidad de Diluirse: " + capacidadDiluirse + "\n" +
                "¿Es Movible? " + movible;
    }
}