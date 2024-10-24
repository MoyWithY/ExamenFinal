package com.example.demo.servicio4;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.dto2.UsuarioRegistroDTO;
import com.example.demo.entidades1.Usuarios;

public interface UsuarioServicio {

	
	public Usuarios guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuarios> listar();
}
