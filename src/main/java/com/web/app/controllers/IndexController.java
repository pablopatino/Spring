package com.web.app.controllers;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {


	// Para varias rutas, (value = {"/index", "/", "/home"})
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("Titulo", "Hola");
		return "index";
	}

	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Pablo");
		usuario.setApellido("Patiño");
		usuario.setEmail("correo");
		model.addAttribute("usuario", usuario);
		return "perfil";
	}

	@GetMapping("/lista")
	public String listar(Model model) {

		model.addAttribute("titulo", "Listado de usuarios");

		return "lista";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> listadoUsuarios() {

		List<Usuario> usuarios = Arrays.asList(new Usuario("Juan", "Alberto", "pedro@gmei"),
				new Usuario("ll", "23", "45"));

		return usuarios;
	}

}
