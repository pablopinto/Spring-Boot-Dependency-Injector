package com.bolsadeideas.springboot.injector.app.controllers.models.service;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complejo";
	}

}
