package com.sergiobejaranoarroyo;

public class Atleta implements Comparable {
    private String nombre;
    private String pais;
    private Integer tiempo;
    private boolean finisher;
    private int dorsal;
    private Categorias categoria;
    private static int numeroAtletas = 1;

    public Atleta(String nombre, String pais, Categorias categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.categoria = categoria;
        this.finisher = false;
        this.dorsal = Atleta.numeroAtletas;
        Atleta.numeroAtletas++;
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

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", tiempo=" + tiempo +
                ", finisher=" + finisher +
                ", dorsal=" + dorsal +
                ", categoria=" + categoria +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Atleta a1 = (Atleta) o;
        return this.tiempo - a1.getTiempo();
    }
}