package com.company.app.controller;

import com.company.app.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products") // Base URL pathway
public class Controller {

    private final List<Product> products = new ArrayList<>(List.of(
            new Product(1L, "Laptop", 999.99),
            new Product(2L, "Smartphone", 499.99)
    ));

    // GET: Retrieve all products
    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    // POST: Create a new product
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }
}

