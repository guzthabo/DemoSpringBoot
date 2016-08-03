package springboot.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Saludo {
	
	@JsonInclude(Include.NON_NULL)
	private String nombre;
	private static final String hola = "Hola";
	private static final String mundo = "Mundo";
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getHola() {
		return hola;
	}
	
	public String getMundo() {
		return mundo;
	}
	
}
