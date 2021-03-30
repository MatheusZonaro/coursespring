package com.zonaro.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zonaro.course.entities.User;

// São os recursos da aplicação, tnho um objeto user, agr um user resource
// Controlldores rest, que precisa de uma service e dps data repositories

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping // metodo que responde a http
	public ResponseEntity<User> findAll(){ // RespondeEntity é um generics do spring para retorno do banco
		
		User u = new User(1L, "Maria", "maria@hotmail.com", "11975626289", "123456");
		return ResponseEntity.ok().body(u); // retorno do banco
	}

}
