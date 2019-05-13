package com.bolsadeideas.springboot.injector.app.controllers.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Factura  implements Serializable{

	private static final long serialVersionUID = 4771041789863278626L;

	@Value("${factura.descripcion}")
	private String descripcion;

	@Autowired
	private Cliente cliente;

	@Autowired
	private List<ItemFactura> items;
	
	@PostConstruct
	public void init() {
		
		cliente.setNombre(cliente.getNombre().concat(" ").concat("Tenderinni"));
		descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre().concat(cliente.getApellido()));

	}
	
	@PreDestroy
	public void destroy() {
		System.out.print("Factura destruida: ".concat(cliente.getNombre()));
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
