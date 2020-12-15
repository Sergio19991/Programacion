package com.sergiobejaranoarroyo;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        p1.edad = 50;
        p1.estatura = 180;
        p1.nombre = "Manuel";

        p1.saludar();
        p1.crecer(6);
    }
}