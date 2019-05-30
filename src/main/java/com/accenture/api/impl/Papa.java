package com.accenture.api.impl;

import java.util.Date;

import com.accenture.api.Familia;
import com.accenture.api.interfaces.Actividades;

/**
 * La clase implementa la interface Actividades y hereda de la clase abstracta Familia
 * @author nestrada
 *
 */
public class Papa extends Familia implements Actividades{

	public String hacerTarea() {
		Date fechaTarea = new Date(); //Se utiliza API java util para las fechas, import java.util.Date
		return "cocinar en la fecha: " + fechaTarea;
		
	}

}
