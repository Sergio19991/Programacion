package com.sergiobejaranoarroyo;

public class EmpresaOnline extends Pedido {
    private String nombreEmpresa;

    public EmpresaOnline(String nombre, int cantidad, double precio, int codigo, String identificadorPedido, String nombreEmpresa) {
        super(nombre, cantidad, precio, codigo, identificadorPedido);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "Nombre de la Empresa: " + nombreEmpresa + "\n" +
                "Identificador del Pedido: " + identificadorPedido;
    }
}