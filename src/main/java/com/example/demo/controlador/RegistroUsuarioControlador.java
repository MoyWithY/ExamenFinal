package com.example.demo.controlador;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto2.UsuarioRegistroDTO;
import com.example.demo.servicio4.UsuarioServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping ("/registro")
public class RegistroUsuarioControlador {
	
	public UsuarioServicio usuarioServicio;

	public RegistroUsuarioControlador(UsuarioServicio usuarioServicio) {
		super();
		this.usuarioServicio = usuarioServicio;
	}
	
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
		
	}
	
	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}
	
	
	@PostMapping
	public String registrarCuentaDeUsuario (@ModelAttribute ("usuario") UsuarioRegistroDTO registroDTO ){
		//TODO: process POST request
		usuarioServicio.guardar(registroDTO);

		return "redirect:/registro?exito";
	}
	
	

	
	
	
}
