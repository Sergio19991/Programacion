package com.sergiobejaranoarroyo;

public class Main {

    public static void main(String[] args) {
        PilaTabla pt = new PilaTabla();

        pt.apilar(5);
        pt.apilar(6);
        pt.apilar(8);

        System.out.println(pt);

        pt.desapilar();
        pt.desapilar();

        System.out.println(pt);

        pt.desapilar();
        System.out.println(pt.desapilar());
    }
}