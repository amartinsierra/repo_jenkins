package controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Ficha;
//@RequestMapping("sfichas")
@RestController
public class FichaController {
	@GetMapping(value="datos/{dni}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Ficha datosPersona(@PathVariable("dni") String dni) {
		//transforma la ficha en un JSON
		return new Ficha("prueba ficha",dni,20);
	}
	
	
}
