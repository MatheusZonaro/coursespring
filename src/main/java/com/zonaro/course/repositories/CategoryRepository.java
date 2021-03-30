package com.zonaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zonaro.course.entities.Category;

@Repository // Nem é ao necessario pq ja herda do jparepository que tem o @repository
public interface CategoryRepository extends JpaRepository<Category, Long>{ // Pediu o tipo, no caso como é user que to criando, entao user, e o id é long
	
	

}
