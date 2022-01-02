package com.demoapi.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.demoapi.models.entities.Product;
import com.demoapi.models.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService implements ServiceComponents{

    @Autowired
    private ProductRepository repository;

    @Override
    public Product post(Product params) {
        return repository.save(params);
    }

    @Override
    public Iterable<Product> get() {
        return repository.findAll();
    }

    @Override
    public Product getById(Long id) {
        Optional<Product> product = repository.findById(id);
        if (!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    @Override
    public String delete(Long id) {
        Optional<Product> product = repository.findById(id);
        if (!product.isPresent()) {
            return "Data Not Found";
        }
        repository.deleteById(id);
        return "Success deleted!";
    }

}
