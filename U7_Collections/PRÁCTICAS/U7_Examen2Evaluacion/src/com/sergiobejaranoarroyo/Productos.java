package com.sergiobejaranoarroyo;

public class Productos {
    private String nombre;
    private int cantidad;
    private double precio;
    private int codigo;

    public Productos(String nombre, int cantidad, double precio, int codigo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Nombre del Producto: " + nombre + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Precio: " + precio + "\n" +
                "Código del Producto: " + codigo;
    }
}