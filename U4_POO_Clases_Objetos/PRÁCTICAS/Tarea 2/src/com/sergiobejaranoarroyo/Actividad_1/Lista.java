package com.sergiobejaranoarroyo.Actividad_1;

import java.awt.geom.Area;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista {
    private int numeroElementos;
    private Integer[] tabla;

    public Lista() {
        numeroElementos = 0;
        tabla = new Integer[10];
    }

    public Lista(int capacidadInicial) {
        numeroElementos = 0;
        tabla = new Integer[capacidadInicial];
    }

    int NumeroElementos() {
        return numeroElementos;
    }

    public boolean listaLlena() {
        return numeroElementos == tabla.length;
    }

    void insetrarPrincipio(Integer nuevo) {
        if (listaLlena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }

        for (int i = numeroElementos; i >= 1; i--) {
            tabla[i] = tabla[i - 1];
        }

        tabla[0] = nuevo;
        numeroElementos++;
    }

    public void insertarFinal(Integer nuevo) {
        if (listaLlena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }

        tabla[numeroElementos] = nuevo;
        numeroElementos++;
    }

    void insertarFinal(Lista otraLista) {
        while (numeroElementos + otraLista.numeroElementos > tabla.length) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }

        for (int i = numeroElementos, j = 0; j < otraLista.numeroElementos; i++, j++) {
            tabla[i] = otraLista.tabla[j];
        }
    }

    boolean insertar(int posicion, Integer nuevo) {
        boolean insertado = true;

        if (posicion < 0 || posicion > numeroElementos) {
            insertado = false;
        } else {
            if (listaLlena()) {
                tabla = Arrays.copyOf(tabla, tabla.length + 10);
            }

            for (int i = numeroElementos; i > posicion; i--) {
                tabla[i] = tabla[i - 1];
            }

            tabla[posicion] = nuevo;
            numeroElementos++;
        }

        return insertado;
    }

    public Integer eliminar(int inidice) {
        Integer eliminado = null;

        if (inidice >= 0 && inidice < numeroElementos) {
            eliminado = tabla[inidice];

            for (int i = inidice; i < numeroElementos; i++) {
                tabla[i] = tabla[i + 1];
            }

            numeroElementos--;
        }

        return eliminado;
    }

    public Integer get(int indice) {
        Integer resultado = null;

        if (indice >= 0 && indice < numeroElementos) {
            resultado = tabla[indice];
        }

        return resultado;
    }

    int buscar(Integer claveBusqueda) {
        int indice = -1;

        for (int i = 0; i < numeroElementos && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }

        return indice;
    }

    void ordenar() {
        Arrays.sort(tabla, 0, numeroElementos);
    }

    public String mostrar() {
        String res = "";

        for (int i = 0; i < numeroElementos; i++) {
            res += tabla[i] + " ";
        }

        return res;
    }
}