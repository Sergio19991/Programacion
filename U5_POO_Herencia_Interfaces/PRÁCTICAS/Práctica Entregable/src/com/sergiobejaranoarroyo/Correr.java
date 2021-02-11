package com.sergiobejaranoarroyo;

public interface Correr {
    public default String correr() {
        return "Voy a correr";
    }
}