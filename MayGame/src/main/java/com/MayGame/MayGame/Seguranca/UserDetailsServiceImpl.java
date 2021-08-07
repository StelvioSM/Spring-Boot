package com.MayGame.MayGame.Seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.MayGame.MayGame.Model.Usuario;
import com.MayGame.MayGame.Repository.UsuarioRepository;


public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository repository; 

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = repository.findByEmail(username);

		if (usuario.isPresent()) {
			return new UserDetaiIsmpI(usuario.get());
		} else {
			throw new UsernameNotFoundException(username + "not fround.");
		}
	
	}
}

