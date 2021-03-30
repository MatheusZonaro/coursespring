package com.zonaro.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.zonaro.course.entities.User;
import com.zonaro.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner { // CommandLineRunner é um macete para executar isso quando spring iniciar
	
	@Autowired
	private UserRepository userRepository; //Com a anotação acima o spring associa o userRepository a essa classe

	@Override
	public void run(String... args) throws Exception {

		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		// para salvar, chamo o userRepository que salva os dados
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}


	




}
