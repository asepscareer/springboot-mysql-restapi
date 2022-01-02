package com.demoapi.services;

import com.demoapi.models.entities.Product;
import org.springframework.stereotype.Component;

@Component
public interface ServiceComponents {

    Product post(Product params);
    Iterable<Product> get();
    Product getById (Long id);
    String delete (Long id);

}
