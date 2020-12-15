package com.sergiobejaranoarroyo;

public class Persona {
    private String nombre = "Pepe";
    private byte edad = 20;
    private double estatura = 181.2;

    public boolean esViejo() {
        if (edad > 18) {
            return true;
        }

        return false;
    }

    public void saludar() {
        System.out.println("Hola, encantado de conocerte. Me llamo " + nombre.toUpperCase());
    }

    public void cumplirAnos() {
        edad++;
    }

    public void crecer(double incremento) {
        estatura += incremento;
    }

}