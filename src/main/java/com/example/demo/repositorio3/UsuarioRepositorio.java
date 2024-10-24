package com.example.demo.repositorio3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades1.Usuarios;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuarios, Long>{

}
