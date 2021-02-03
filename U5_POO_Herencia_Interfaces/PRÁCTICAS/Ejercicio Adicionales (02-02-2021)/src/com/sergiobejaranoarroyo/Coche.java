package com.sergiobejaranoarroyo;

public class Coche extends Vehiculo {
    /*****************/
    /** EJERCICIO 1 **/
    /*****************/

    private int cilindrada;

    public Coche(int c) {
        super();
        this.cilindrada = c;
    }

    public void quemaRueda() {
        System.out.println("Fffshhhhhhhhhhh");
    }
}