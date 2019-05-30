package com.accenture.api.impl;

import com.accenture.api.Familia;
import com.accenture.api.interfaces.Actividades;

/**
 * La clase implementa la interface Actividades y hereda de la clase abstracta Familia
 * @author nestrada
 *
 */

public class Hijo extends Familia implements Actividades{

	public String hacerTarea() {
		return "buscar trabajo";
	}

}