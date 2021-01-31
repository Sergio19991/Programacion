package com.sergiobejaranoarroyo;

public class PilaLista implements Pila {
    /*****************/
    /** ACTIVIDAD 1 **/
    /*****************/

    @Override
    public void apilar(Integer elemento) {

    }

    @Override
    public Integer desapilar() {
        return null;
    }

    /*private int indiceCima;
    private Lista lista;

    public PilaLista() {
        indiceCima = -1;
        lista = new Lista();
    }

    public PilaLista(int capacidadInicial) {
        lista = new Lista(capacidadInicial);
    }

    private boolean pilaVacia() {
        return indiceCima == -1;
    }

    private boolean pilaLlena() {
        return lista.listaLlena();
    }

    int cima() {
        return lista.numeroElementos() - 1;
    }

    @Override
    public void apilar(Integer elemento) {
        lista.insertarFinal(elemento);
        indiceCima++;
    }

    @Override
    public Integer desapliar() {
        Integer elemento = lista.eliminar(indiceCima);

        if (elemento != null) {
            indiceCima--;
        }

        return elemento;
    }

    @Override
    public String toString() {
        return lista.toString() + "(cima)";
    }*/
}