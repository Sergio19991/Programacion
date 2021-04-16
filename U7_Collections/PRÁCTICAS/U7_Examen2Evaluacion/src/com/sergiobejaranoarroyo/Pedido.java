package com.sergiobejaranoarroyo;

public class Pedido extends Productos {
    public String identificadorPedido;

    public Pedido(String nombre, int cantidad, double precio, int codigo, String identificadorPedido) {
        super(nombre, cantidad, precio, codigo);
        this.identificadorPedido = identificadorPedido;
    }

    public String getIdentificadorPedido() {
        return identificadorPedido;
    }

    public void setIdentificadorPedido(String identificadorPedido) {
        this.identificadorPedido = identificadorPedido;
    }

    @Override
    public String toString() {
        return "Identifacor del Pedido: " + identificadorPedido;
    }
}