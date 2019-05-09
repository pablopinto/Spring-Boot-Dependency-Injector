package com.bolsadeideas.springboot.injector.app.controllers.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante";
	}

}
