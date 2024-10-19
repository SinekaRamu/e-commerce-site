package com.example.e_commerce.service;

import com.example.e_commerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "Iphone 16", 160000),
            new Product(102, "Vivo 45", 50000),
            new Product(103, "Galaxy S14", 40000));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(Integer id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(new Product(100, "No items found", 0));
    }
}
