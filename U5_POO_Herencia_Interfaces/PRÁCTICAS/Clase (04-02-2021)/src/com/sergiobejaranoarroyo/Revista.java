package com.sergiobejaranoarroyo;

public class Revista extends Publicacion {
    private int numero;

    public Revista(String isbn, String titulo, int ano, int numero) {
        super(isbn, titulo, ano);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + ano;
    }
}