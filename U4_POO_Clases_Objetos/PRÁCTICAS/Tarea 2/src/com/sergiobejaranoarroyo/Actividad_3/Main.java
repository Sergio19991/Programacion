package com.sergiobejaranoarroyo.Actividad_3;

public class Main {

    public static void main(String[] args) {
        PilaLista p = new PilaLista();

        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }

        Integer num = p.desapilar();

        while (num != num) {
            System.out.println(num);
            num = p.desapilar();
        }
    }
}