package com.sergiobejaranoarroyo;

public class Alumno extends Persona {
    private String curso;
    private Integer edad;

    public Alumno(String name, String dni, String tlf, String email, String direccion, String curso, Integer edad) {
        super(name, dni, tlf, email, direccion);
        this.curso = curso;
        this.edad = edad;
    }

    public Alumno(String name, String dni, String tlf, String direccion, String curso, Integer edad) {
        super(name, dni, tlf, direccion);
        this.curso = curso;
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "curso='" + curso + '\'' +
                ", edad=" + edad +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public void gritar() {
        System.out.println("Ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
    }
}