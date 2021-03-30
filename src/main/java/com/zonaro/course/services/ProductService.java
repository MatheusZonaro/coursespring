package com.zonaro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zonaro.course.entities.Product;
import com.zonaro.course.repositories.ProductRepository;

@Service // Para registrar como um coponente do spring para poder utilizar o autowired, poderia ser service, component, resource
public class ProductService {
	
	@Autowired
	private ProductRepository repository; // Autowired faz a injeção de dependencias
	
	public List<Product> findAll(){
		return repository.findAll(); // Faço o metodo de find all que passa para o spring repository.find all que ja possui isso
	}
	
	public Product findById(Long id){
		Optional<Product> obj = repository.findById(id);
		return obj.get(); // get vai retornar um objeto user do optional
	}

}
