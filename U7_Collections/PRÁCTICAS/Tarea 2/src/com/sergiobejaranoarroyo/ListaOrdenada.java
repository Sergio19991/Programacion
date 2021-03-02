package com.sergiobejaranoarroyo;

import java.util.Collections;
import java.util.LinkedList;

public class ListaOrdenada extends LinkedList {
    /**
     * ACTIVIDAD 15
     **/

    <E> void insertarOrdenada(E elemento) {
        this.add(elemento);
        Collections.sort(this);
    }
}