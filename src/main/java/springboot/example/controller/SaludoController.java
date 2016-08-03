package springboot.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.example.model.Saludo;

@RestController
public class SaludoController {
	
	@RequestMapping(value="/{nombre}")
	@ResponseBody
	public Saludo saludar(@PathVariable("nombre") String nombre){
		Saludo s = new Saludo();
		s.setNombre(nombre);
		return s;
	}
	
	@RequestMapping("/")
	@ResponseBody
	public Saludo saludar(){
		Saludo s = new Saludo();
		return s;
	}
}
