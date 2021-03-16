package com.sergiobejaranoarroyo;

public class Atleta extends Maraton {
    private String nombre;
    private String pais;
    private int marca;
    private Categorias categoria;
    private boolean finisher;

    public Atleta(String numeroDorsal, String nombre, String pais, int marca, Categorias categorias, boolean finisher) {
        super(numeroDorsal);
        this.nombre = nombre;
        this.pais = pais;
        this.marca = marca;
        this.categoria = categorias;
        this.finisher = finisher;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    @Override
    public String toString() {
        return "Número del Dorsal: " + getNumeroDorsal() + "\n" +
                "Nombre: " + nombre + "\n" +
                "País: " + pais + "\n" +
                "Marca: " + marca + "\n" +
                "Categoría: " + categoria + "\n" +
                "¿Finisher?: " + finisher;
    }
}