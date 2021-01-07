package com.sergiobejaranoarroyo.Actividad_1;

public class Main {

    public static void main(String[] args) {
        Lista l = new Lista();
        l.insertarFinal(3);
        l.insertarFinal(2);
        l.insertarFinal(1);
        l.insertarFinal(4);
        l.insertarFinal(5);
        System.out.println(l.mostrar());

        l.insetrarPrincipio(0);
        l.insetrarPrincipio(1);
        l.insetrarPrincipio(2);
        l.insetrarPrincipio(3);
        l.insetrarPrincipio(4);
        System.out.println(l.mostrar());

        l.insertar(2, 10);
        System.out.println(l.mostrar());

        l.eliminar(2);
        System.out.println(l.mostrar());
    }
}