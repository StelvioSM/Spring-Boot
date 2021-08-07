package com.MayGame.MayGame.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MayGame.MayGame.Repository.PostagemGame;

@RestController
@RequestMapping ("/Controle")
@CrossOrigin("*")
public class PostagemControleGame {

	@Autowired
	private PostagemGame repository;
	
	@GetMapping
	public ResponseEntity<List<PostagemGame>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<PostagemGame> GetById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<PostagemGame>> GetByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}

	@PostMapping
	public ResponseEntity<PostagemGame> post(@RequestBody PostagemGame categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));

	}

	@PutMapping
	public ResponseEntity<PostagemGame> put(@RequestBody PostagemGame categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
    @DeleteMapping("/{id}")
   public void delete(@PathVariable Long id) {
  repository.deleteById(id);
}
}




