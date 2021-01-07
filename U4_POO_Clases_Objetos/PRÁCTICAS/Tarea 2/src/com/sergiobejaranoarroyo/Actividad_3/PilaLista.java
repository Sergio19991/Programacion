package com.sergiobejaranoarroyo.Actividad_3;

import com.sergiobejaranoarroyo.Actividad_1.Lista;

public class PilaLista {
    private int indiceCima;
    private Lista lista;

    public PilaLista() {
        indiceCima = -1;
        lista = new Lista();
    }

    public PilaLista(int capacidadInicial) {
        indiceCima = -1;
        lista = new Lista(capacidadInicial);
    }

    private boolean pilaVacia() {
        return indiceCima == -1;
    }

    private boolean pilaLlena() {
        return lista.listaLlena();
    }

    Integer cima() {
        Integer elementoCima = null;

        if (!pilaVacia()) {
            elementoCima = lista.get(indiceCima);
        }

        return elementoCima;
    }

    void apilar(Integer elemento) {
        lista.insertarFinal(elemento);
        indiceCima++;
    }

    Integer desapilar() {
        Integer elemento = lista.eliminar(indiceCima);

        if (elemento != null) {
            indiceCima--;
        }

        return elemento;
    }

    public String mostrar() {
        return lista.mostrar() + "(cima)";
    }
}