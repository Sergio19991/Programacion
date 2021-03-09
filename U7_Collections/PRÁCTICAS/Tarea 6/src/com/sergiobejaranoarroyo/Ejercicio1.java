package com.sergiobejaranoarroyo;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> listaPrecios = new HashMap<String, Double>();
        String producto = "", cantidad = "";
        List productos = new ArrayList<LineaPedido>();
        Double total = 0.0;

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
                productos.add(lp);
            }
        } while (!producto.equals("fin"));

        Iterator it = productos.iterator();

        System.out.println("--------------------------------------------------");
        while (it.hasNext()) {
            LineaPedido p = (LineaPedido) it.next();
            Double precioUnitario = listaPrecios.get(p.getNombre());
            System.out.print(p.getNombre() + "   ");
            System.out.print(listaPrecios.get(p.getNombre()) + "   ");
            System.out.print(p.getCantidad() * precioUnitario + "   ");

            total += p.getCantidad() * precioUnitario;
        }

        System.out.println("TOTAL: " + total);
        System.out.print("--------------------------------------------------");
    }
}