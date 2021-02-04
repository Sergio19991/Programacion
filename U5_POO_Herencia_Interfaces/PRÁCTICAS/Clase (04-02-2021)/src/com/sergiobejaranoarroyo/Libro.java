package com.sergiobejaranoarroyo;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String isbn, String titulo, int ano) {
        super(isbn, titulo, ano);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + ano + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
    }

    @Override
    public void presta() {
        prestado = true;
    }

    @Override
    public void devuelve() {
        prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }
}