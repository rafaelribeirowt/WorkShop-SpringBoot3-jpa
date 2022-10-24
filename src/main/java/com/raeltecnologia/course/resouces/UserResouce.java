package com.raeltecnologia.course.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raeltecnologia.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "maria", "maria@gmail.com", "9995584654", "123456");
		return ResponseEntity.ok().body(u);
		
		
	}
	
	
	

}
