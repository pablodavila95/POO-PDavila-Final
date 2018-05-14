package com.company;

public class Articulo {
    private int clave;
    private String descripcion;
    private double price;
    private String caducidad;

    public Articulo() {
    }

    public Articulo(int clave, String descripcion, double price, String caducidad) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.price = price;
        this.caducidad = caducidad;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString(){
        return "Articulo #" + getClave() + " y la descripcion es: " + getDescripcion();
    }

}
