package com.sergiobejaranoarroyo;

/**
 * ACTIVIDAD 15:
 **/

import java.util.Comparator;
import java.util.LinkedList;

public class ListaOrdenada<E> extends LinkedList<E> {
    protected Comparator<E> comparador;

    ListaOrdenada(Comparator c) {
        super();
        comparador = c;
    }

    void insertarOrdenado(E elemento) {
        if (size() == 0) {
            add(elemento);
        } else {
            int indiceIntersenccion = 0;

            while (indiceIntersenccion < size() && comparador.compare(elemento, get(indiceIntersenccion)) > 0) {
                indiceIntersenccion++;
            }

            add(indiceIntersenccion, elemento);
        }
    }
}

class EnterosDecrecientes implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class CompareCadenas implements Comparator<String> {
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}