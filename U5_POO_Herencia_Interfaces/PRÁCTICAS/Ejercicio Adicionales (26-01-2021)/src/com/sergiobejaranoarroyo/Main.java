package com.sergiobejaranoarroyo;

public class Main {

    private static Object Terminal;

    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("* EJERCICIO 8 *");
        System.out.println("***************");
        Terminal t1 = new Terminal("678 11 22 33");
        Terminal t2 = new Terminal("644 74 44 69");
        Terminal t3 = new Terminal("622 32 89 09");
        Terminal t4 = new Terminal("664 73 98 18");
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);


        System.out.println();


        System.out.println("***************");
        System.out.println("* EJERCICIO 9 *");
        System.out.println("***************");
        Movil m1 = new Movil("678 11 22 33", Tarifa.RATA);
        Movil m2 = new Movil("644 74 44 69", Tarifa.MONO);
        Movil m3 = new Movil("622 32 89 09", Tarifa.BISONTE);
        System.out.println(m1);
        System.out.println(m2);
        m1.costeLlamada(m2, 320);
        m1.costeLlamada(m3, 200);
        m1.costeLlamada(m3, 550);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}