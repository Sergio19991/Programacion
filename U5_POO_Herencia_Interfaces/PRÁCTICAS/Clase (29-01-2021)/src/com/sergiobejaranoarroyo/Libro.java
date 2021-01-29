package com.sergiobejaranoarroyo;

public class Libro implements Comparable<Libro> {
    private String isbn;
    private Integer paginas;
    private Double precio;
    private String autor;
    private String editorial;

    public Libro(String isbn, Integer paginas, Double precio, String autor, String editorial) {
        this.isbn = isbn;
        this.paginas = paginas;
        this.precio = precio;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\n' +
                ", paginas=" + paginas + '\n' +
                ", precio=" + precio + '\n' +
                ", autor='" + autor + '\n' +
                ", editorial='" + editorial + '\n' +
                '}';
    }

    @Override
    public int compareTo(Libro o) {
        return isbn.compareTo(o.isbn);
    }
}