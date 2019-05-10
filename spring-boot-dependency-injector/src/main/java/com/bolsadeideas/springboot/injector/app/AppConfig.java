package com.bolsadeideas.springboot.injector.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.injector.app.controllers.models.service.IServicio;
import com.bolsadeideas.springboot.injector.app.controllers.models.service.MiServicio;
import com.bolsadeideas.springboot.injector.app.controllers.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
}
