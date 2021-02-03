package com.sergiobejaranoarroyo;

public class Bicicleta extends Vehiculo {
    /*****************/
    /** EJERCICIO 1 **/
    /*****************/

    private int pinones;

    public Bicicleta(int p) {
        super();
        this.pinones = p;
    }

    public void hazCaballito() {
        System.out.println("Estoy haciendo el caballito");
    }
}