package com.MayGame.MayGame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemGame extends JpaRepository<PostagemGame, Long> {
	public List<PostagemGame> findAllByTituloContainingIgnoreCase(String titulo);
	
}




