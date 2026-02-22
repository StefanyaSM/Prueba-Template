package com.fing.app.models;

public class BRate {


    // constructor vacio
    public BRate() {}

    private String estado;

    public BRate(String estado){
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }
}