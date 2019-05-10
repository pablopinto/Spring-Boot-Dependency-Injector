package com.bolsadeideas.springboot.injector.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.injector.app.controllers.models.service.IServicio;

@Controller
public class IndexController {
	
//	private MiServicio servicio = new MiServicio();
	
	@Autowired
	@Qualifier("miServicioComplejo")
	private IServicio servicio;
	
	@GetMapping({"/" , "" , "/index"})
	public String index(Model model) {
		
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

//	@Autowired
//	public void setServicio(IServicio servicio) {
//		this.servicio = servicio;
//	}

	//clase 33
	
}
