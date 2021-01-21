package com.sergiobejaranoarroyo;

public class Main {
    public static void main(String[] args) {
        /*****************/
        /** ACTIVIDAD 1 **/
        /*****************/
        Hora h1 = new Hora(23, 59);
        h1.inc();
        System.out.println(h1);

        System.out.println();


        /*****************/
        /** ACTIVIDAD 2 **/
        /*****************/
        Hora12 hh1 = new Hora12(12, 59, Hora12.Meridiano.AM);
        hh1.inc();
        System.out.println(hh1);
        System.out.println();


        /*****************/
        /** ACTIVIDAD 3 **/
        /*****************/
        HoraExacta he1 = new HoraExacta(23, 59, 59);
        he1.inc();
        System.out.println(he1);
        System.out.println();




        /*****************/
        /** ACTIVIDAD 7 **/
        /*****************/
        Caja c1 = new Caja(4.2, 6.3, 7.9, "yo", Unidades.CM);
        System.out.println(c1);
    }
}