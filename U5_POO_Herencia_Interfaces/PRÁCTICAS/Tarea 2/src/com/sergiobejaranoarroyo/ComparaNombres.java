package com.sergiobejaranoarroyo;

import java.util.Comparator;

public class ComparaNombres implements Comparator {
    /*****************/
    /** ACTIVIDAD 2 **/
    /*****************/

    @Override
    public int compare(Object o1, Object o2) {
        return ((Cliente) o1).nombre.compareTo(((Cliente) o2).nombre);
    }
}