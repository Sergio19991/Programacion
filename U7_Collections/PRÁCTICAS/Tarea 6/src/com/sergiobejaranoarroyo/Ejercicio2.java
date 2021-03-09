package com.sergiobejaranoarroyo;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> listaPrecios = new HashMap<String, Double>();
        String producto = "", cantidad = "", codigoDescuento = "";
        List productos = new ArrayList<LineaPedido>();
        Double total = 0.0, totalDescuento = 0.0;

        listaPrecios.put("tomate", 1.59);
        listaPrecios.put("quinoa", 4.50);
        listaPrecios.put("avena", 2.21);

        do {
            System.out.print("Producto: ");
            producto = sc.nextLine();

            if (!producto.equals("fin")) {
                System.out.print("Cantidad: ");
                cantidad = sc.nextLine();

                LineaPedido lp = new LineaPedido(producto, Integer.parseInt(cantidad));

                if (!productos.contains(lp)) {
                    productos.add(lp);
                } else {
                    Integer posicion = productos.indexOf(lp);
                    LineaPedido old = (LineaPedido) productos.get(posicion);
                    old.setCantidad(old.getCantidad() + Integer.parseInt(cantidad));
                }
            }
        } while (!producto.equals("fin"));

        System.out.print("Introduzca el código de descuento (INTRO si no tiene ninguno): ");
        codigoDescuento = sc.nextLine();

        Iterator it = productos.iterator();

        System.out.println("----------------------------------------");
        while (it.hasNext()) {
            LineaPedido p = (LineaPedido) it.next();
            Double precioUnitario = listaPrecios.get(p.getNombre());
            System.out.print(p.getNombre() + "   ");
            System.out.print(listaPrecios.get(p.getNombre()) + "   ");
            System.out.println(p.getCantidad() * precioUnitario + "   ");

            total += p.getCantidad() * precioUnitario;
        }

        if (codigoDescuento.equals("ECODTO")) {
            totalDescuento = (total * 10) / 100;
            System.out.println("----------------------------------------");
            System.out.println("Descuento: " + totalDescuento);
            System.out.println("----------------------------------------");
            System.out.println("TOTAL: " + (total - totalDescuento));
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Descuento: " + 0.00);
            System.out.println("----------------------------------------");
            System.out.println("TOTAL: " + total);
        }
    }
}