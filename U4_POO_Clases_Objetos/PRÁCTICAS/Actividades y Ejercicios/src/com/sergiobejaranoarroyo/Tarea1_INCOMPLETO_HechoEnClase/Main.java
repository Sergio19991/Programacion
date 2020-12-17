package com.sergiobejaranoarroyo.Tarea1_INCOMPLETO_HechoEnClase;

public class Main {
    public static void main(String[] args) {
        /** ACTIVIDAD 1: */
        CuentaCorriente c1 = new CuentaCorriente("Pepe Pérez", "22222X");
        CuentaCorriente c2 = new CuentaCorriente("Rosa López", "333333333X");


        /** ACTIVIDAD 2: **/
        CuentaCorriente c3 = new CuentaCorriente(100);
        CuentaCorriente c4 = new CuentaCorriente(500, -100, "8456755G");


        /** ACTIVIDAD 1: **/
        c1.ingresarDinero(100);
        c2.ingresarDinero(200);

        c1.sacarDinero(50);
        c1.sacarDinero(300);

        c1.mostrarInformacion();
        c2.mostrarInformacion();


        /** ACTIVIDAD 4: **/
        CuentaCorriente.nombreBanco="Bankia";
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();
        c4.mostrarInformacion();

        /** ACTIVIDAD 5: **/
        Texto t = new Texto(3);
        t.anadirFinal('a');
        t.anadirPrincipio('c');
    }
}