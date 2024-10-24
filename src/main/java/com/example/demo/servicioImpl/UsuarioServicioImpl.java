package com.example.demo.servicioImpl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.example.demo.dto2.UsuarioRegistroDTO;
import com.example.demo.entidades1.Rol;
import com.example.demo.entidades1.Usuarios;
import com.example.demo.repositorio3.UsuarioRepositorio;
import com.example.demo.servicio4.UsuarioServicio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	
	private UsuarioRepositorio usuarioRepositorio;
	
	
	public UsuarioServicioImpl (UsuarioRepositorio usuarioRepositorio) {
			super();
			this.usuarioRepositorio=usuarioRepositorio;
	}
	
	
	
	@Override
	public Usuarios guardar(UsuarioRegistroDTO registroDTO) {
		// TODO Auto-generated method stub
		Usuarios usuario =  new Usuarios(registroDTO.getNombre(),registroDTO.getApellidos(),
			registroDTO.getFechaNacimiento(),registroDTO.getEmail(), registroDTO.getContrasena(), Arrays.asList(new Rol("Role_user"))	);
		return usuarioRepositorio.save(usuario);
	}

}
