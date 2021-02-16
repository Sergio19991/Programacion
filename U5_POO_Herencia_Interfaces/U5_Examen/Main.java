package com.sergiobejaranoarroyo;

public class Main {
    public static void main(String[] args) {
        Prenda prenda1 = new Prenda(12.56, "PRENDA 1", 132465978, 0.26, EstadoPrenda.prendaColgada, 0.90);
        Prenda prenda2 = new Prenda(10.78, "PRENDA 2", 978465321, 0.75, EstadoPrenda.GENERAL);
        Prenda prenda3 = new Prenda(9.81, "PRENDA 3", 465978321, 0.81, EstadoPrenda.prendaColgada, 1.26);

        prenda1.devolver();

        prenda2.doblar();

        prenda2.colgar();
    }
}
