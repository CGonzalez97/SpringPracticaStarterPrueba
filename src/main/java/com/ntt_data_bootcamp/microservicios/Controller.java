package com.ntt_data_bootcamp.microservicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Saludo saludo;


	@GetMapping("/saludo")
	public ResponseEntity<String> saludo() {
		
		return new ResponseEntity<String>(HttpStatus.OK).ok(saludo.mensajeSaludo());
	}

}
