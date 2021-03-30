package com.zonaro.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zonaro.course.entities.Product;
import com.zonaro.course.services.ProductService;

// São os recursos da aplicação, tnho um objeto user, agr um user resource
// Controlldores rest, que precisa de uma service e dps data repositories

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping // metodo que responde a http
	public ResponseEntity<List<Product>> findAll(){ // RespondeEntity é um generics do spring para retorno do banco
		
		List<Product> list = service.findAll();
		
		return ResponseEntity.ok().body(list); // retorno do banco
	}
	
	
	@GetMapping(value = "/{id}") // quer dizer qu aceita id no metodo
	public ResponseEntity<Product> findById(@PathVariable Long id){  // to dizendo que o id daqui vem de cima

		Product obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	

}
