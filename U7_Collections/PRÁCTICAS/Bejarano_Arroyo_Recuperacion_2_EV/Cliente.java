package com.sergiobejaranoarroyo;

public class Cliente {
    public String nombre;
    public String apellidos;
    public String dni;
    public String telefono;
    public String email;
    public String direccionTienda;

    public Cliente(String nombre, String apellidos, String dni, String telefono, String email, String direccionTienda) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.direccionTienda = direccionTienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "DNI: " + dni + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Email: " + email + "\n" +
                "Dirección de la Tienda para recoger: " + direccionTienda;
    }
}