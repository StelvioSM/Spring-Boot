package com.MayGame.MayGame.Model;

public class Usuario {
	
	private String nome;
	private String usuario;
	private String senha;
	private String email;
	private String token;
	public String getNome() {
	   return nome;
}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
