package com.sergiobejaranoarroyo;

public abstract class Minecraft {
    private Material[] materiales;

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
}
