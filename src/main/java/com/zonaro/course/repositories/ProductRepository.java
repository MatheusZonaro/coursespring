package com.zonaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zonaro.course.entities.Product;

@Repository // Nem é ao necessario pq ja herda do jparepository que tem o @repository
public interface ProductRepository extends JpaRepository<Product, Long>{ // Pediu o tipo, no caso como é user que to criando, entao user, e o id é long
	
	

}
