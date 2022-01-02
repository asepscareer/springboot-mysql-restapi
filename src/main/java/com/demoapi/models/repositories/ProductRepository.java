package com.demoapi.models.repositories;

import com.demoapi.models.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
