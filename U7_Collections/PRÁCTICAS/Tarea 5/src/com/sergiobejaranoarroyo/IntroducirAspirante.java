package com.sergiobejaranoarroyo;

public class IntroducirAspirante {

    public static Aspirante insertarAspirante(String nombre, String dni, String phone) {
        return new Aspirante(nombre, dni, phone);
    }
}