package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("* EJERCICIO 1 *");
        System.out.println("***************");
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int km;

        Bicicleta paseo = new Bicicleta(9);
        Coche seat = new Coche(1900);

        while (opcion != 8) {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = sc.nextInt();
                    paseo.recorre(km);
                    break;
                case 2:
                    paseo.hazCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = sc.nextInt();
                    seat.recorre(km);
                    break;
                case 4:
                    seat.quemaRueda();
                    break;
                case 5:
                    System.out.println("La bicicleta lleva recorridos ");
                    System.out.println(paseo.getKilometrosRecorridos() + " Km");
                    break;
                case 6:
                    System.out.println("El coche lleva recorridos ");
                    System.out.println(seat.getKilometrosRecorridos() + " Km");
                    break;
                case 7:
                    System.out.println("Los vehículos llevan recorridos ");
                    System.out.println(Vehiculo.getKilometrosTotales() + " Km");
                default:
            }
        }
        System.out.println();


        System.out.println("***************");
        System.out.println("* EJERCICIO 2 *");
        System.out.println("***************");
        Ameba a1 = new Ameba();
        a1.come(2);
        System.out.println(a1);
        Ameba a2 = new Ameba();
        a2.come(4);
        System.out.println(a2);
        a1.come(a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.come(3);
        System.out.println(a2);
        System.out.println();


        System.out.println("***************");
        System.out.println("* EJERCICIO 3 *");
        System.out.println("***************");
        TarjetaRegalo t1 = new TarjetaRegalo(100);
        TarjetaRegalo t2 = new TarjetaRegalo(120);
        System.out.println(t1);
        System.out.println(t2);
        t1.gasta(45.90);
        t2.gasta(5);
        t2.gasta(200);
        t1.gasta(3.55);
        System.out.println(t1);
        System.out.println(t2);
        TarjetaRegalo t3 = t1.fusionaCon(t2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println();


        System.out.println("***************");
        System.out.println("* EJERCICIO 4 *");
        System.out.println("***************");
        Libro libro1 = new Libro("123456", "La Ruta Prohibida", 2007);
        Libro libro2 = new Libro("112233", "Los Otros", 2016);
        Libro libro3 = new Libro("456789", "La rosa del mundo", 1995);
        Revista revista1 = new Revista("444555", "Año Cero", 2019, 344);
        Revista revista2 = new Revista("002244", "National Geographic", 2003, 255);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);
        libro2.presta();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro2.presta();
        libro2.devuelve();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro3.presta();
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println();
    }
}