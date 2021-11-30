package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	private final static Logger logger= LoggerFactory.getLogger(Controller.class);
	@GetMapping("/")
	public ResponseEntity<String> index(){
		logger.info("Llamada al endpoint inicial");
		return new ResponseEntity<String>(HttpStatus.OK).ok("Hola");
	}
}
