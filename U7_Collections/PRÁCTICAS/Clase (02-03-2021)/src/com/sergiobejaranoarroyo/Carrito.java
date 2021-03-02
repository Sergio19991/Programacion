package com.sergiobejaranoarroyo;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    /**
     * EJERCICIO 3
     **/

    private List productos;

    public Carrito() {
        this.productos = new ArrayList<Producto>();
    }

    public List getProductos() {
        return productos;
    }

    public void setProductos(List productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Productos: " + productos;
    }
}