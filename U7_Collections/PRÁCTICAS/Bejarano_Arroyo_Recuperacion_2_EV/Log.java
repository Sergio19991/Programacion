package com.sergiobejaranoarroyo;

import java.time.LocalDate;

public interface Log {
    LocalDate fechaPedido = LocalDate.now();

    public static void prinLog(MetodoPago metodoPago, double costeTotal) {
        System.out.println("Fecha del Pedido: " + PedidosOnline.fechaPedido);
        System.out.println("Método de Pago: " + metodoPago);
        System.out.println("Coste Total del Pedido: " + costeTotal);

    }
}