package com.bolsadeideas.springboot.injector.app.controllers.models.service;

//@Primary
//@Component("miServicioSimple")
public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante simple ";
	}

}
