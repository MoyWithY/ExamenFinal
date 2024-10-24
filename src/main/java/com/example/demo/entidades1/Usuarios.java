package com.example.demo.entidades1;






import java.time.LocalDateTime;
import java.util.Collection;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "usuarios" ,uniqueConstraints= @UniqueConstraint(columnNames="email"))
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotBlank(message = "El nombre es requerido")
    @Size(min = 4, max = 60, message = " debe tener entre 4 y 60 caracteres")
    @Column(name="nombre" )
    private String nombre;

    @NotBlank(message = "El apellido es requerido")
    @Size(min = 4, max = 60, message = " debe tener entre 4 y 60 caracteres")
    @Column(name="apellidos")
    private String apellidos;

    
    
    
    @Column(name="fecha_nacimiento")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @NotNull(message = "La fecha de nacimiento es requerida")
    private String fechaNacimiento;
    
    

    @NotBlank(message = "El correo es requerido")
    @Email(message = "Debe ingresar un correo electrónico válido")
    @Column(name="email")
    private String email;


    @Column(name = "fecha_registro", updatable = false)
    private LocalDateTime fechaRegistro;
    
    
    @Column(name="contrasena")
    @NotBlank(message = "La contraseña es requerida")
    private String contrasena;
    
    @ManyToMany(fetch =FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(
    		name="usuarios_roles",
    		joinColumns=@JoinColumn(name="usuario_id",referencedColumnName="id"),
    		inverseJoinColumns =@JoinColumn(name="rol_id",referencedColumnName="id")
    		)
    
     private Collection<Rol> roles;
    

    
    public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}



	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}



	public Usuarios() {
    	
    }



	public Long getIdUsuario() {
		return id;
	}



	public void setIdUsuario(Long id) {
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



	public Collection<Rol> getRoles() {
		return roles;
	}



	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}



	public Usuarios(
			@NotBlank(message = "El nombre es requerido") @Size(min = 4, max = 60, message = " debe tener entre 4 y 60 caracteres") String nombre,
			@NotBlank(message = "El apellido es requerido") @Size(min = 4, max = 60, message = " debe tener entre 4 y 60 caracteres") String apellidos,
			@NotNull(message = "La fecha de nacimiento es requerida") String fechaNacimiento,
			@NotBlank(message = "El correo es requerido") @Email(message = "Debe ingresar un correo electrónico válido") String email,
			@NotBlank(message = "La contraseña es requerida") String contrasena, Collection<Rol> roles) {
		super();
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.contrasena = contrasena;
		this.roles = roles;
	}



	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", contrasena=" + contrasena
				+ ", roles=" + roles + "]";
	}






	
	
	
	


	







	
	
	
    
    
}