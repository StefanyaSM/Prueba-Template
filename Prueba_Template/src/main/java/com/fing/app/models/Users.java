package com.fing.app.models;

public class Users {

    private String nombre;

    public Users() { }

    public Users(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}