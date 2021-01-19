package com.sergiobejaranoarroyo;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe", "22222222X", "66777888", "Aquí");
        Alumno a1 = new Alumno("Rosa Torres", "33333333X", "777888999", "Allí", "DAW1", 30);
        Profesor prof = new Profesor("Manuel Conde", "44444444H", "555222777", "fgdsfdg@gg", "Ahí", "6654885533170038", "LMSGI");

        p1.gritar();
        a1.gritar();
        prof.gritar();

        System.out.println(p1);
        System.out.println(a1);
        System.out.println(prof);
    }
}