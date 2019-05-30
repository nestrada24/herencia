package com.accenture.api.impl;

import com.accenture.api.Familia;
import com.accenture.api.interfaces.Actividades;

/**
 * La clase implementa la interface Actividades y hereda de la clase abstracta Familia
 * @author nestrada
 *
 */
public class Mama extends Familia implements Actividades{

	public String hacerTarea() {
		return "ver final UEFA";
	}

}
