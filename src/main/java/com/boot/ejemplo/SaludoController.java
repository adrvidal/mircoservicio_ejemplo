package com.boot.ejemplo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
	
	//http://localhost:4000/myservice/saludo/
	@GetMapping(value = "saludo", produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Micro servicio Sprint boot";
	}
	
	// Envió de datos con PATH VARIABLES
	//http://localhost:4000/myservice/saludo/Tere
	@GetMapping(value = "saludo/{name}", produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludoPathVariable(@PathVariable("name") String cadenaName) {
		return "Bienvenido Sr/a: "+cadenaName;
	}
	
	// Envió de datos con parametros en la URL
	//http://localhost:4000/myservice/despedida?name=Juan
	@GetMapping(value = "despedida", produces=MediaType.TEXT_PLAIN_VALUE)
	public String despedidaRequestParam(@RequestParam("name") String cadenaName) {
		return "Hasta luego Sr/a: "+cadenaName;
	}
}
 