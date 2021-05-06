package com.sergiobejaranoarroyo;

public class NuevaComida {
    private String nombre;
    private double precio;
    private String descripcion;

    public NuevaComida(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + nombre + "\n" +
                "PRECIO: $" + precio + "\n" +
                "DESCRIPCIÓN: " + descripcion;
    }
}