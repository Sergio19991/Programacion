package com.sergiobejaranoarroyo;

public class PedidosOnline extends Pedido implements Log {
    private String ipNavegador;
    MetodoPago metodoPago;

    public PedidosOnline(String nombre, int cantidad, double precio, int codigo, String identificadorPedido) {
        super(nombre, cantidad, precio, codigo, identificadorPedido);
    }


    public String getIpNavegador() {
        return ipNavegador;
    }

    public void setIpNavegador(String ipNavegador) {
        this.ipNavegador = ipNavegador;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "Identificador del Pedido: " + identificadorPedido + "\n" +
                "IP del Navegador: " + ipNavegador + "\n" +
                "Método de Pago: " + metodoPago;
    }
}