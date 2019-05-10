package com.bolsadeideas.springboot.injector.app.controllers.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complejo";
	}

}
