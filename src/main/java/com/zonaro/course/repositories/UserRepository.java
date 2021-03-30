package com.zonaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zonaro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{ // Pediu o tipo, no caso como é user que to criando, entao user, e o id é long
	
	

}
