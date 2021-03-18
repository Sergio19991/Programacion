package com.sergiobejaranoarroyo;

import javax.accessibility.AccessibleText;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Maraton {
    private Map<Integer, Atleta> atletas;

    public Maraton() {
        atletas = new HashMap<>();
    }

    public Map<Integer, Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(Map<Integer, Atleta> atletas) {
        this.atletas = atletas;
    }

    public void inscribirAtleta() {
        Scanner sc = new Scanner(System.in);
        String nombre, pais, categoriaAtleta;
        Categorias categoria = null;

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("País: ");
        pais = sc.nextLine();

        System.out.print("Categoría: ");
        categoriaAtleta = sc.nextLine();

        if (categoriaAtleta.equals("SENIOR")) {
            categoria = Categorias.SENIOR;
        } else if (categoriaAtleta.equals("JUNIOR")) {
            categoria = Categorias.JUNIOR;
        } else if (categoriaAtleta.equals("VETERANO")) {
            categoria = Categorias.VETERANO;
        }

        Atleta a = new Atleta(nombre, pais, categoria);
        atletas.put(a.getDorsal(), a);
    }

    public void guardarTiempo(Integer dorsal, int tiempo) {
        if (atletas.containsKey(dorsal)) {
            atletas.get(dorsal).setTiempo(tiempo);
            atletas.get(dorsal).setFinisher(true);
        }
    }

    public boolean borrarAtleta(Integer dorsal) {
        if (atletas.containsKey(dorsal)) {
            atletas.remove(dorsal);
            return true;
        }

        return false;
    }

    public void mostrarListaFinishers() {
        Collection<Atleta> valores = atletas.values();
        TreeSet<Atleta> ordenado = new TreeSet<>();
        Iterator it = valores.iterator();

        while (it.hasNext()) {
            Atleta a = (Atleta) it.next();

            if (a.isFinisher()) {
                ordenado.add(a);
            }
        }

        System.out.println(ordenado);
    }

    public void mostrarListaCategoria(Categorias categoria) {
        Collection<Atleta> valores = atletas.values();
        Set<Atleta> ordenado = new TreeSet<>();

        for (Atleta a : valores) {
            if (a.getCategoria().equals(categoria) && a.isFinisher()) {
                ordenado.add(a);
            }
        }

        System.out.println(ordenado);
    }

    public void participantesPorPais(String pais) {
        int num = 0;

        Collection<Atleta> valores = atletas.values();

        for (Atleta a : valores) {
            if (a.getPais().equals(pais)) {
                num++;
            }
        }

        System.out.println("El número de participantes de " + pais + ", es " + num);
    }

    public void cargarAtletas() {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("atletas.dat"));

            while (true) {
                Atleta a = (Atleta) is.readObject();
                atletas.put(a.getDorsal(), a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void guardarAtletas() {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("atletas.dat"));

            Collection<Atleta> participantes = atletas.values();

            for (Atleta a : participantes) {
                os.writeObject(a);
            }

            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}