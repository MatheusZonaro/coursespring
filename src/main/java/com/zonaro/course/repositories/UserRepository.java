package com.zonaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zonaro.course.entities.User;

@Repository // Nem é ao necessario pq ja herda do jparepository que tem o @repository
public interface UserRepository extends JpaRepository<User, Long>{ // Pediu o tipo, no caso como é user que to criando, entao user, e o id é long
	
	

}
