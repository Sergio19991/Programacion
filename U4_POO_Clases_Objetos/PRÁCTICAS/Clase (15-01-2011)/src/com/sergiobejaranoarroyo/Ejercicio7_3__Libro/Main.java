package com.sergiobejaranoarroyo.Ejercicio7_3__Libro;


public class Main {

    public static void main(String[] args) {
        Punto p1 = new Punto(4.5, 6.8);
        Punto p2 = new Punto(3.2, 9.12);
        Punto p3 = new Punto(19.9, 21.1);

        p1.distancia(4.3, 2.1);
        System.out.println(p1);

        System.out.println(p1.distanciaEuclidea(p2));

        p3.desplaza(2.3);
        System.out.println(p3);
    }
}