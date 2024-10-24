package com.example.demo.dto2;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UsuarioRegistroDTO {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    private Long id;

	    @NotBlank(message = "El nombre es requerido")
	    @Size(min = 4, max = 60, message = " debe tener entre 4 y 60 caracteres")
	  
	    private String nombre;

	    @NotBlank(message = "El apellido es requerido")
	    @Size(min = 4, max = 60, message = " debe tener entre 4 y 60 caracteres")
	   
	    private String apellidos;

	    
	    
	    
	   
	    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	    @NotNull(message = "La fecha de nacimiento es requerida")
	    private String fechaNacimiento;
	    
	    

	    @NotBlank(message = "El correo es requerido")
	    @Email(message = "Debe ingresar un correo electrónico válido")
	    
	    private String email;

	    
	    
	    @NotBlank(message = "La contraseña es requerida")
	    private String contrasena;



		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getApellidos() {
			return apellidos;
		}



		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}



		public String getFechaNacimiento() {
			return fechaNacimiento;
		}



		public void setFechaNacimiento(String fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public String getContrasena() {
			return contrasena;
		}



		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}





		@Override
		public String toString() {
			return "UsuarioRegoistroDTO [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos
					+ ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", contrasena=" + contrasena + "]";
		}
	
	
	    
	    
	    
}
