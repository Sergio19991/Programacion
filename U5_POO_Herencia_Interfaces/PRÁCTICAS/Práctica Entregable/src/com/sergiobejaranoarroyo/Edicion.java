package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Edicion {
    protected int anoCelebracion;
    protected String sede;
    protected Pais[] paises;
    protected Deporte[] deportes;

    public Edicion(int anoCelebracion, String sede, Pais[] paises, Deporte[] deportes) {
        this.anoCelebracion = anoCelebracion;
        this.sede = sede;
        this.paises = paises;
        this.deportes = deportes;
    }

    public int getAnoCelebracion() {
        return anoCelebracion;
    }

    public void setAnoCelebracion(int anoCelebracion) {
        this.anoCelebracion = anoCelebracion;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPaises() {
        return paises;
    }

    public void setPaises(Pais[] paises) {
        this.paises = paises;
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }

    public boolean anadirPais(Pais nuevoPais) {
        if (paises != null) {
            if (paises.length == Double.POSITIVE_INFINITY) {
                return false;
            } else {
                Pais[] p1 = new Pais[paises.length + 1];
                for (int i = 0; i < paises.length; i++) {
                    p1[i] = paises[i];
                }
                p1[paises.length] = nuevoPais;
                paises = p1;
                return true;
            }
        } else {
            paises = new Pais[1];
            paises[0] = nuevoPais;
            return true;
        }
    }

    public boolean anadirDeporte(Deporte nuevoDeporte) {
        if (deportes != null) {
            if (deportes.length == Double.POSITIVE_INFINITY) {
                return false;
            } else {
                Deporte[] d1 = new Deporte[deportes.length + 1];
                for (int i = 0; i < deportes.length; i++) {
                    d1[i] = deportes[i];
                }
                d1[deportes.length] = nuevoDeporte;
                deportes = d1;
                return true;
            }
        } else {
            deportes = new Deporte[1];
            deportes[0] = nuevoDeporte;
            return true;
        }
    }

    public void mostrarPaises() {
        System.out.println(Arrays.toString(paises));
    }

    public void mostrarPaisesParaCeremonia() {
        System.out.println(Arrays.toString(paises));
    }
}