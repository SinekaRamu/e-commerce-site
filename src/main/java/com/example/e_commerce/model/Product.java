package com.example.e_commerce.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class Product {

    private int id;
    private String prodName;
    private int price;

    public Product() {
    }

}
