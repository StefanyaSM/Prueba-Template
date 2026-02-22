package com.fing.app.models;

public class Order {
	
	private int folio= 0;
	private String usuario;

	
	public Order() { //constructor vacio
	}

	
	public Order(int i) { //constructor con int
	    this.folio = i;
	}

	
	//setters y getters
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public int getFolio() {
		return folio;
	}
	
	
	

}
