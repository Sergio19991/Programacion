package com.sergiobejaranoarroyo;

public class Actividad16 {
    public static void main(String[] args) {
        Traductor t = new Traductor("traductor.txt");
        System.out.println(t.getDiccionario());

        System.out.println(t.traducir("hola mundo adios mundo gracias de nada"));
    }
}