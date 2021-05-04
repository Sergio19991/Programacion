package Ejercicio;

public class Asignatura {
    private String nombre;
    private int horas;

    public Asignatura(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Nombre de la Asignatura: " + nombre + "\n" +
                "Total de Horas: " + horas;
    }
}