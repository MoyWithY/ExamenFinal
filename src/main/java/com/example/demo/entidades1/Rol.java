package com.example.demo.entidades1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="rol")
public class Rol {
	

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	 
	 	@NotBlank(message = "El nombre es requerido")
	    @Size(min = 4, max = 60, message = " debe tener entre 4 y 60 caracteres")
	    @Column(name="nombre" )
	    private String nombre;

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

		public Rol(
				@NotBlank(message = "El nombre es requerido") @Size(min = 4, max = 60, message = " debe tener entre 4 y 60 caracteres") String nombre) {
			super();
		
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "Rol [id=" + id + ", nombre=" + nombre + "]";
		}
	    
	    
	    
		
		
	    
}
