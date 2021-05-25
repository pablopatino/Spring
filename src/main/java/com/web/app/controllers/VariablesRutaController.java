package com.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class VariablesRutaController {
	
	@GetMapping("/string/{texto}")
	public String variables(@PathVariable String texto, Model model) {
		
		model.addAttribute("titulo", "Path variable");
		model.addAttribute("resultado", "El texto enviado a la ruta es " + texto);
		
		return "variables/ver";
	}

}
