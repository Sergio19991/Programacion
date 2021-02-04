package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche("COCHE 1", 5, "1111-AAA", 2000, Color.AMARILLO);
        Coche coche2 = new Coche("COCHE 2", 4, "2222-BBB", 2001, Color.AZUL);
        Coche coche3 = new Coche("COCHE 3", 2, "3333-CCC", 2002, Color.ROJO);

        Motocicleta moto1 = new Motocicleta("MOTO 1", 1, "4444-DDD", 2003, Color.VERDE);
        Motocicleta moto2 = new Motocicleta("MOTO 2", 2, "5555-EEE", 2004, Color.ROJO);
        Motocicleta moto3 = new Motocicleta("MOTO 3", 1, "5555-FFF", 2005, Color.AZUL);

        Helicoptero helicoptero1 = new Helicoptero("HELICÓPTERO 1", 2, 1500, "UP-A301");

        Avioneta avioneta1 = new Avioneta("AVIONETA 1", 1, 3600, "UP-A302");

        Coche[] coches = new Coche[3];
        coches[0] = coche1;
        coches[1] = coche2;
        coches[2] = coche3;
        Arrays.sort(coches);
        System.out.println(Arrays.toString(coches));

        Motocicleta[] motos = new Motocicleta[3];
        motos[0] = moto1;
        motos[1] = moto2;
        motos[2] = moto3;
        Arrays.sort(motos);
        System.out.println(Arrays.toString(motos));

        helicoptero1.transportar(9);

        System.out.println(helicoptero1.getNumeroPersonas());
    }
}