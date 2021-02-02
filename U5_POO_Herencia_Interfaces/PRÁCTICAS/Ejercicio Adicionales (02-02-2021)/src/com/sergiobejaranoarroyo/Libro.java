package com.sergiobejaranoarroyo;

public class Libro extends Publicacion {
    /*****************/
    /** EJERCICIO 4 **/
    /*****************/

    private String autor;

    public Libro(String nombre, String editorial, String autor) {
        super(nombre, editorial);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Modificar para que incluya los atributos del padre
    @Override
    public String toString() {
        return "Libro [autor=" + autor + "]";
    }
}