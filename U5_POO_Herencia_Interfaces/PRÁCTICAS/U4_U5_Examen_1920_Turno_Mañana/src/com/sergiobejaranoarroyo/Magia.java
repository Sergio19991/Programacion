package com.sergiobejaranoarroyo;

public interface Magia {

    default void encantar(Personaje p) {
        p.setEncantado(true);
    }

    default void desencantar(Personaje p) {
        p.setEncantado(false);
    }
}