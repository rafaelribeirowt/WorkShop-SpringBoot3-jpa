package com.raeltecnologia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raeltecnologia.course.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {

}