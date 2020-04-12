package com.formaciondbi.springboot.app.item.models;

import java.io.Serializable;
import java.util.Date;

public class Producto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nombre;
	private Double precio;
	private Date creado;
	
	private Integer puerto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public Integer getPuerto() {
		return puerto;
	}

	public void setPuerto(Integer puerto) {
		this.puerto = puerto;
	}
	
}
