package com.example.services;

import com.example.entity.Buyer;
import com.example.repository.BuyerRepository;

import java.sql.SQLException;
import java.util.List;

public class BuyerService {
    private final BuyerRepository buyerRepository = new BuyerRepository();

    public BuyerService() throws SQLException {
    }

    public void add(String name) throws SQLException {
        buyerRepository.save(Buyer.builder().name(name).build());
    }

    public List<Buyer> get() {
        return buyerRepository.get();
    }
}
