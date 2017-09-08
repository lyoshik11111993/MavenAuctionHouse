package com.example.services;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService {
    private final ProductRepository productRepository = new ProductRepository();

    public ProductService() throws SQLException {
    }

    public void add(String name, int sellerId) throws SQLException {
        productRepository.save(Product.builder().name(name).sellerId(sellerId).build());
    }

    public List<Product> get() {
        return productRepository.get();
    }
}