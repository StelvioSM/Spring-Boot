package com.MayGame.MayGame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MayGame.MayGame.Model.Tema;



@Repository 
public interface TemaGame extends JpaRepository<Tema,Long> {

	List<Tema> findAllByDescricaoContainingIgnoreCase(String nome); 

	}
