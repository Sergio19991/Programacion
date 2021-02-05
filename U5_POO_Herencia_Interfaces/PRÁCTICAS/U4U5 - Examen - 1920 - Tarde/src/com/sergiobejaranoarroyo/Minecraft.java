package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Minecraft {
    private Material[] materiales;

    /**
     * LÍMITE DE MATERIALES A 10:
     **/
    public boolean anadirMaterial(Material material) {
        if (materiales != null) {
            if (materiales.length == 10) {
                System.out.println("No puedes añadir más Materiales.");
                return false;
            } else {
                Material[] material1 = new Material[materiales.length + 1];

                for (int i = 0; i < materiales.length; i++) {
                    material1[i] = materiales[i];
                }

                material1[materiales.length] = material;
                materiales = material1;
                return true;
            }
        } else {
            materiales = new Material[1];
            materiales[0] = material;
            return true;
        }
    }

    /**
     * BORRAR MATERIAL SIN MASA:
     **/
    public void borrarMaterialSinMasa() {
        int numeroMateriales = 0;

        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i].getMasa() <= 0) {
                numeroMateriales++;
            }
        }

        Material[] material1 = new Material[materiales.length - numeroMateriales];
        int m = 0;

        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i].getMasa() > 0) {
                material1[m] = materiales[i];
                m++;
            }

            materiales = material1;
        }
    }

    /**
     * MUESTRA EL ESTADO  DE TODOS LOS MATERIALES:
     **/
    public void mostrarEstado() {
        Arrays.sort(materiales);
        System.out.println(Arrays.deepToString(materiales));
    }

    /**
     * MOSTRAR EL ÚLTIMO MATERIAL QUE QUEDA:
     **/
    public void ultimoMaterialQueQueda() {
        if (materiales.length == 1) {
            System.out.println(Arrays.deepToString(materiales));
        }
    }
}