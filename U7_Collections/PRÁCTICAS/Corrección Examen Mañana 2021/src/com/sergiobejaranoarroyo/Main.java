package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        Atleta atleta1 = new Atleta("ATLETA 1", "PAÍS 1", Categoria.JUNIOR);
        Atleta atleta2 = new Atleta("ATLETA 2", "PAÍS 2", Categoria.JUNIOR);
        Atleta atleta3 = new Atleta("ATLETA 3", "PAÍS 3", Categoria.JUNIOR);
        Atleta atleta4 = new Atleta("ATLETA 4", "PAÍS 4", Categoria.JUNIOR);
        Atleta atleta5 = new Atleta("ATLETA 5", "PAÍS 5", Categoria.JUNIOR);
        Atleta atleta6 = new Atleta("ATLETA 6", "PAÍS 6", Categoria.SENIOR);
        Atleta atleta7 = new Atleta("ATLETA 7", "PAÍS 7", Categoria.SENIOR);
        Atleta atleta8 = new Atleta("ATLETA 8", "PAÍS 8", Categoria.SENIOR);
        Atleta atleta9 = new Atleta("ATLETA 9", "PAÍS 9", Categoria.SENIOR);
        Atleta atleta10 = new Atleta("ATLETA 10", "PAÍS 10", Categoria.SENIOR);
        Atleta atleta11 = new Atleta("ATLETA 11", "PAÍS 11", Categoria.VETERANO);
        Atleta atleta12 = new Atleta("ATLETA 12", "PAÍS 12", Categoria.VETERANO);
        Atleta atleta13 = new Atleta("ATLETA 13", "PAÍS 13", Categoria.VETERANO);
        Atleta atleta14 = new Atleta("ATLETA 14", "PAÍS 14", Categoria.VETERANO);
        Atleta atleta15 = new Atleta("ATLETA 15", "PAÍS 15", Categoria.VETERANO);

        do {
            System.out.println("Elige una Opción:");
            System.out.println("1. Cargar Atletas.");
            System.out.println("2. Guardar Atletas.");
            System.out.println("3. Inscribir Atleta.");
            System.out.println("4. Guardar Tiempo.");
            System.out.println("5. Borrar Atleta.");
            System.out.println("6. MostrarListaFinishers.");
            System.out.println("7. MostrarlistaCategoría.");
            System.out.println("8. ParticpantesPorPaís.");
            System.out.println("9. Cargar Atletas.");
            System.out.print("OPCIÓN: ");
            opcion = sc.nextLine();
            System.out.println();
        } while (!opcion.equals("9"));
    }
}