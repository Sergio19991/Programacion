package com.sergiobejaranoarroyo;

import java.util.Objects;

public class Producto {
    /**
     * EJERCICIO 3
     **/

    private String nombre;
    private Integer cantidad;
    private Double precio;

    public Producto(String nombre, Integer cantidad, Double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return nombre.equals(producto.nombre) && precio.equals(producto.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Precio: " + precio;
    }
}