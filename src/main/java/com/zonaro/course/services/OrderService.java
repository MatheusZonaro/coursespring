package com.zonaro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zonaro.course.entities.Order;
import com.zonaro.course.repositories.OrderRepository;

@Service // Para registrar como um coponente do spring para poder utilizar o autowired, poderia ser service, component, resource
public class OrderService {
	
	@Autowired
	private OrderRepository repository; // Autowired faz a injeção de dependencias
	
	public List<Order> findAll(){
		return repository.findAll(); // Faço o metodo de find all que passa para o spring repository.find all que ja possui isso
	}
	
	public Order findById(Long id){
		Optional<Order> obj = repository.findById(id);
		return obj.get(); // get vai retornar um objeto user do optional
	}

}
