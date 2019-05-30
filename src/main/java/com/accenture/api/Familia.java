package com.accenture.api;

import com.accenture.api.enums.GeneroEnum;

/**
 * Familia es una clase abstracta que permite declarar métodos sin tener que definirlos. 
 * @author nestrada
 *
 */
public abstract class Familia {

	public String nombre;
	public String apellidos;
	public Long edad;
	public GeneroEnum genero;
	
	
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
	public Long getEdad() {
		return edad;
	}
	public void setEdad(Long edad) {
		this.edad = edad;
	}
	public GeneroEnum getGenero() {
		return genero;
	}
	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}
	
	
}
