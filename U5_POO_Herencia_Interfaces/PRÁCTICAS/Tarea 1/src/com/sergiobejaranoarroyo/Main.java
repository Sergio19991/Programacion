package com.sergiobejaranoarroyo;

public class Main {

    public static void main(String[] args) {
        Hora h = new Hora(23, 59);
        h.inc();
        System.out.println(h);

        Hora12 h2 = new Hora12(12, 59);
        h2.inc();
        h2.inc();
        h2.inc();
        h2.inc();
        System.out.println(h2.getHora() + ":" + h2.getMin());
    }
}