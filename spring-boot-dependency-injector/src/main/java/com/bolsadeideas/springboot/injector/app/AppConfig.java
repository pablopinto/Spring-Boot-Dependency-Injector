package com.bolsadeideas.springboot.injector.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.injector.app.controllers.models.domain.ItemFactura;
import com.bolsadeideas.springboot.injector.app.controllers.models.domain.Producto;
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
	
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		
		Producto producto1 = new Producto("Camara Sony" , 100);
		Producto producto2 = new Producto("Cascos Sony" , 200);
		
		
		ItemFactura linea1 = new ItemFactura(producto1 , 2);
		ItemFactura linea2 = new ItemFactura(producto2 , 4);
		
		return Arrays.asList(linea1,linea2);
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficinas(){
		
		Producto producto1 = new Producto("Monitor Sony" , 250);
		Producto producto2 = new Producto("Notebook Sony" , 500);
		Producto producto3 = new Producto("Impresora Sony" , 80);
		Producto producto4 = new Producto("Escritorio Oficina" , 30);
		
		
		ItemFactura linea1 = new ItemFactura(producto1 , 2);
		ItemFactura linea2 = new ItemFactura(producto2 , 1);
		ItemFactura linea3 = new ItemFactura(producto3 , 1);
		ItemFactura linea4 = new ItemFactura(producto4 , 1);
		
		return Arrays.asList(linea1,linea2,linea3,linea4);
	}
	
}
