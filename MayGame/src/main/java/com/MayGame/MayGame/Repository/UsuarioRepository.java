package com.MayGame.MayGame.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MayGame.MayGame.Model.Usuario;


public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByEmail(String email);
	}