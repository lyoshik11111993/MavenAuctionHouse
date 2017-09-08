package com.example.services;

import com.example.entity.Seller;
import com.example.repository.SellerRepository;

import java.sql.SQLException;
import java.util.List;

public class SellerService {
    private final SellerRepository sellerRepository = new SellerRepository();

    public SellerService() throws SQLException {
    }

    public void add(String name) throws SQLException {
        sellerRepository.save(Seller.builder().name(name).build());
    }

    public List<Seller> get() {
        return sellerRepository.get();
    }
}
