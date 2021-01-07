package com.sergiobejaranoarroyo;

import com.sergiobejaranoarroyo.maquinaria.Locomotora;
import com.sergiobejaranoarroyo.maquinaria.Tren;
import com.sergiobejaranoarroyo.maquinaria.Vagon;
import com.sergiobejaranoarroyo.personal.Maquinista;
import com.sergiobejaranoarroyo.personal.Mecanico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 1 *");
        System.out.println("* * * * * * * *");
        com.sergiobejaranoarroyo.CuentaCorriente c;
        c = new com.sergiobejaranoarroyo.CuentaCorriente("Pepe", "12345678A");

        //c.limite = -100;

        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();

        System.out.println("Puedo sacar 700€: " + c.egreso(700));
        System.out.println("Puedo sacar 500€: " + c.egreso(500));
        System.out.println(" ");


        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 2 *");
        System.out.println("* * * * * * * *");
        com.sergiobejaranoarroyo.CuentaCorriente c1, c2, c3;

        c1 = new com.sergiobejaranoarroyo.CuentaCorriente("Pepe", "12345678A");
        c2 = new com.sergiobejaranoarroyo.CuentaCorriente(1000);
        c3 = new com.sergiobejaranoarroyo.CuentaCorriente(1000, "12345678A", 50);

        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();
        System.out.println(" ");


        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 3 *");
        System.out.println("* * * * * * * *");
        c = new com.sergiobejaranoarroyo.CuentaCorriente("Pepe", "12345678-A");

        //c.saldo=2000;
        c.dni = "11111111-T";
        //c.limite=-100;
        System.out.println(" ");


        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 4 *");
        System.out.println("* * * * * * * *");
        c1 = new com.sergiobejaranoarroyo.CuentaCorriente("Pepe", "12345678-A");
        c2 = new com.sergiobejaranoarroyo.CuentaCorriente("Ana", "999999999-E");

        c1.mostrarInformacion();
        c2.nombreBanco = "Banco Central";
        c1.mostrarInformacion();
        com.sergiobejaranoarroyo.CuentaCorriente.nombreBanco = "Caixa";
        c1.mostrarInformacion();
        com.sergiobejaranoarroyo.CuentaCorriente.cambiarNombreBanco("Caja Rural");
        c1.mostrarInformacion();
        System.out.println(" ");


        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 5 *");
        System.out.println("* * * * * * * *");
        Texto t = new Texto(5);

        t.addPrincipio("HO");
        t.addPrincipio(';');
        t.add("Lá");
        t.add('X');

        t.mostrar();
        System.out.println("Número de Vocales: " + t.numVocales());
        System.out.println(" ");


        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 6 *");
        System.out.println("* * * * * * * *");
        com.sergiobejaranoarroyo.Banco b1, b2;

        b1 = new com.sergiobejaranoarroyo.Banco("EVO");
        b2 = new com.sergiobejaranoarroyo.Banco("Santander", 10.6, "c/Lanjarón s/n");

        c1 = new com.sergiobejaranoarroyo.CuentaCorriente("Pepita", "12345678-L", b1);
        c2 = new com.sergiobejaranoarroyo.CuentaCorriente("Ana", "98765431-F", b1);
        c1.mostrarInformacionBanco();
        c2.mostrarInformacionBanco();

        c3 = new com.sergiobejaranoarroyo.CuentaCorriente("Luis", "11223344-G");
        c3.mostrarInformacion();
        c3.cambiarBanco(b2);
        c3.mostrarInformacionBanco();
        System.out.println(" ");


        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 7 *");
        System.out.println("* * * * * * * *");
        SintonizadorFM a = new SintonizadorFM(107);
        a.subir();
        a.subir();
        a.subir();
        a.subir();
        a.mostrarInformacionSintonizador();

        SintonizadorFM b = new SintonizadorFM(80.05);
        b.bajar();
        b.bajar();
        b.bajar();
        b.mostrarInformacionSintonizador();

        a = new SintonizadorFM(200);
        a.mostrarInformacionSintonizador();


        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 8 *");
        System.out.println("* * * * * * * *");
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla();

        bombilla1.enciende();
        bombilla2.apaga();

        System.out.println("Bombilla 1: " + bombilla1.muestraEstado());
        System.out.println("Bombilla 2: " + bombilla2.muestraEstado());

        Bombilla.interruptorGeneral = false;
        System.out.println(" Cortamos la Luz General:");
        System.out.println("Bombilla 1: " + bombilla1.muestraEstado());
        System.out.println("Bombilla 2: " + bombilla2.muestraEstado());

        Bombilla.interruptorGeneral = true;
        System.out.println("Activamos la Luz General:");
        System.out.println("Bombilla 1: " + bombilla1.muestraEstado());
        System.out.println("Bombilla 2: " + bombilla2.muestraEstado());
        System.out.println(" ");




        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 9 *");
        System.out.println("* * * * * * * *");
        Mecanico pepe = new Mecanico("Pepe Perez","666777888");
        Locomotora loc = new Locomotora("2222XXX777",5000,2000,pepe);
        Maquinista maquinista = new Maquinista("Julián Rodríguez","6666555X",1500,"Oficial");
        Vagon[] vagones = {new Vagon(10000,1500,"MERCANCIA"),
                new Vagon(11000,1500,"PASAJEROS"),
                new Vagon(12000,1500,"PASAJEROS"),
                new Vagon(13000,1500,"PASAJEROS")};



        Tren tren1 = new Tren(maquinista, loc);

        Tren tren2 = new Tren(maquinista,loc,vagones);

        System.out.println(tren1);
        System.out.println(tren2);

        System.out.println(tren1.addVagon(new Vagon(15000,1500,"PASAJEROS")));

        System.out.println(tren1);

        if (tren2.addVagon(new Vagon(15000,1500,"PASAJEROS"))) {
            System.out.println("AÑADIDO");
        }

        System.out.println(tren2);
        System.out.println(" ");





        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 10 *");
        System.out.println("* * * * * * * *");
        Scanner sc = new Scanner(System.in);
        Hora h = new Hora();
        int valor;
        int numeroSegundos;

        System.out.println("Introduce una Hora:");
        valor = sc.nextInt();
        h.setHora(valor);

        System.out.println("Introduce un Minuto:");
        valor = sc.nextInt();
        h.setMinuto(valor);

        System.out.println("Introduce un Segundo:");
        valor = sc.nextInt();
        h.setSegundo(valor);

        System.out.println("¿Cuántos Segundos quieres mostrar?:");
        numeroSegundos = sc.nextInt();

        for (int i = 0; i < numeroSegundos; i++) {
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
            h.incrementarSegundo();
        }
    }
}