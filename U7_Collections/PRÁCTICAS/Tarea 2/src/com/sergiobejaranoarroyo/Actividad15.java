package com.sergiobejaranoarroyo;

public class Actividad15 {
    public static void main(String[] args) {
        ListaOrdenada<Integer> lista1 = new ListaOrdenada<>(new EnterosDecrecientes());

        for (int i = 0; i < 20; i++) {
            Integer temp = (int) (Math.random() * 30);
            lista1.insertarOrdenado(temp);
        }

        System.out.println("Números aleatorios en Orden Decreciente:");
        System.out.println(lista1);

        ListaOrdenada<String> nombres = new ListaOrdenada<>(new CompareCadenas());
        nombres.insertarOrdenado("Sergio");
        nombres.insertarOrdenado("Juan");
        nombres.insertarOrdenado("Emilio");
        nombres.insertarOrdenado("Sara");
        nombres.insertarOrdenado("Rosa");
        nombres.insertarOrdenado("María");
        System.out.println("\nLista ordenada de Nombres: ");
        System.out.println(nombres);
    }
}