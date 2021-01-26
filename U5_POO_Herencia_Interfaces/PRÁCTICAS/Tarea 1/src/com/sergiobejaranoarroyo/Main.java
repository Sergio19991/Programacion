package com.sergiobejaranoarroyo;

public class Main {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("* ACTIVIDAD 1 *");
        System.out.println("***************");
        Hora h1 = new Hora(23, 59);
        h1.inc();
        System.out.println(h1);

        System.out.println();


        System.out.println("***************");
        System.out.println("* ACTIVIDAD 2 *");
        System.out.println("***************");
        Hora12 hh1 = new Hora12(12, 59, Hora12.Meridiano.AM);
        hh1.inc();
        System.out.println(hh1);
        System.out.println();


        System.out.println("***************");
        System.out.println("* ACTIVIDAD 3 *");
        System.out.println("***************");
        HoraExacta he1 = new HoraExacta(23, 59, 59);
        he1.inc();
        System.out.println(he1);
        System.out.println();


        System.out.println("***************");
        System.out.println("* ACTIVIDAD 4 *");
        System.out.println("***************");
        HoraExacta a = new HoraExacta(1, 2, 3);
        HoraExacta b = new HoraExacta(1, 2, 3);
        HoraExacta c = new HoraExacta(10, 20, 30);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println();


        System.out.println("***************");
        System.out.println("* ACTIVIDAD 6 *");
        System.out.println("***************");
        Campana campana = new Campana();
        campana.add(Instrumento.Nota.DO);
        campana.add(Instrumento.Nota.SI);
        campana.add(Instrumento.Nota.SOL);
        campana.add(Instrumento.Nota.RE);
        campana.interpretarCampana();

        Piano piano = new Piano();
        piano.add(Instrumento.Nota.DO);
        piano.add(Instrumento.Nota.SI);
        piano.add(Instrumento.Nota.MI);
        piano.add(Instrumento.Nota.FA);
        piano.add(Instrumento.Nota.DO);
        piano.interpretarPiano();
        System.out.println();


        System.out.println("***************");
        System.out.println("* ACTIVIDAD 7 *");
        System.out.println("***************");
        Caja cajaA, cajaB;

        cajaA = new Caja(100, 200, 200, Caja.Unidad.CM);
        cajaA.etiqueta = "Sergio / Calle A";

        cajaB = new Caja(1.2, 0.9, 1.45, Caja.Unidad.M);
        cajaB.etiqueta = "Alumno / Calle B";

        System.out.println(cajaA);
        System.out.println("Volumen: " + cajaA.getVolumen());

        System.out.println(cajaB);
        System.out.println("Volumen: " + cajaB.getVolumen());
        System.out.println();


        System.out.println("***************");
        System.out.println("* ACTIVIDAD 8 *");
        System.out.println("***************");
        System.out.println("Caja A:");
        Caja cajA = new CajaCarton(100, 200, 200);
        cajA.etiqueta = "Dirección envío:";
        System.out.println(cajA);
        System.out.println("Volumen: " + cajA.getVolumen());

        System.out.println();

        System.out.println("Caja B:");
        CajaCarton cajB = new CajaCarton(50.6, 75.5, 100);
        cajB.etiqueta = 23;
        System.out.println(cajB);
        System.out.println("Volumen: " + cajB.getVolumen());
        System.out.println();


        System.out.println("***************");
        System.out.println("* ACTIVIDAD 9 *");
        System.out.println("***************");
        System.out.println();
    }
}