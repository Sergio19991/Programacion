package com.sergiobejaranoarroyo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        String numeroDorsal;
        String nombre;
        String pais;
        int marca;
        Categorias categoria = null;
        boolean finisher = false;
        Atleta atleta = null;

        System.out.println("Elige una Opción:");
        System.out.println();
        do {
            System.out.println("1. Cargar Atletas");
            System.out.println("2. Guardar Atletas");
            System.out.println("3. Inscribir Atleta");
            System.out.println("4. Guardar Tiempo");
            System.out.println("5. Borrar Atleta");
            System.out.println("6. MostrarListaFicheros()");
            System.out.println("7. MostrarListaCategoria()");
            System.out.println("8. ParticipantesPorPaís()");
            System.out.println("9. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextLine();
            System.out.println();

            if (opcion.equals("1")) {
                System.out.println(atleta);
                System.out.println();
            } else if (opcion.equals("2")) {
                System.out.print("Número del Dorsal: ");
                numeroDorsal = sc.nextLine();
                System.out.print("Nombre: ");
                nombre = sc.nextLine();
                System.out.print("País: ");
                pais = sc.nextLine();
                System.out.print("Marca: ");
                marca = sc.nextInt();
                System.out.print("Cateoría: ");
                categoria = Categorias.valueOf(sc.nextLine());
                System.out.print("¿Finisher?: ");
                finisher = sc.nextBoolean();
                atleta = new Atleta(numeroDorsal, nombre, pais, marca, categoria, finisher);
                System.out.println();
            } else if (opcion.equals("3")) {
                System.out.print("Número del Dorsal: ");
                numeroDorsal = sc.nextLine();
                System.out.print("Nombre: ");
                nombre = sc.nextLine();
                System.out.print("País: ");
                pais = sc.nextLine();
                System.out.print("Marca: ");
                marca = sc.nextInt();
                System.out.print("Cateoría: ");
                categoria = Categorias.valueOf(sc.nextLine());
                System.out.print("¿Finisher?: ");
                finisher = sc.nextBoolean();
                atleta = new Atleta(numeroDorsal, nombre, pais, marca, categoria, finisher);
                System.out.println();
            } else if (opcion.equals("4")) {
                System.out.print("Número del Dorsal: ");
                numeroDorsal = sc.nextLine();
                System.out.print("Marca: ");
                marca = sc.nextInt();
                finisher = false;
                System.out.println();
            } else if (opcion.equals("5")) {
                System.out.print("Número del Dorsal: ");
                numeroDorsal = sc.nextLine();
                System.out.println();
            } else if (opcion.equals("6") && (finisher == true)) {
                System.out.println(atleta);
                System.out.println();
            } else if (opcion.equals("7")) {
                System.out.print("Categoría: ");
                categoria = Categorias.valueOf(sc.nextLine());
                System.out.println(atleta);
                System.out.println();
            } else if (opcion.equals("8")) {
                System.out.print("País: ");
                pais = sc.nextLine();
                System.out.println();
            }
        } while (!opcion.equals("9"));

        Atleta atleta1 = new Atleta("1", "ATLETA 1", "España", 1, Categorias.SENIOR, true);
        Atleta atleta2 = new Atleta("2", "ATLETA 2", "Portugal", 2, Categorias.SENIOR, true);
        Atleta atleta3 = new Atleta("3", "ATLETA 3", "Francia", 3, Categorias.SENIOR, true);
        Atleta atleta4 = new Atleta("4", "ATLETA 4", "Italia", 3, Categorias.SENIOR, false);
        Atleta atleta5 = new Atleta("5", "ATLETA 5", "Estados Unidos", 2, Categorias.SENIOR, true);
        Atleta atleta6 = new Atleta("6", "ATLETA 6", "Burgaria", 1, Categorias.JUNIOR, false);
        Atleta atleta7 = new Atleta("7", "ATLETA 7", "China", 1, Categorias.JUNIOR, true);
        Atleta atleta8 = new Atleta("8", "ATLETA 8", "Turquía", 2, Categorias.JUNIOR, false);
        Atleta atleta9 = new Atleta("9", "ATLETA 9", "Finlandia", 3, Categorias.JUNIOR, false);
        Atleta atleta10 = new Atleta("10", "ATLETA 10", "España", 3, Categorias.JUNIOR, true);
        Atleta atleta11 = new Atleta("11", "ATLETA 11", "Estados Unidos", 2, Categorias.VETERANO, true);
        Atleta atleta12 = new Atleta("12", "ATLETA 12", "Grecia", 1, Categorias.VETERANO, true);
        Atleta atleta13 = new Atleta("13", "ATLETA 13", "Turquía", 1, Categorias.VETERANO, false);
        Atleta atleta14 = new Atleta("14", "ATLETA 14", "China", 2, Categorias.VETERANO, true);
        Atleta atleta15 = new Atleta("15", "ATLETA 15", "Francia", 3, Categorias.VETERANO, true);
    }
}