package com.example.services;

import com.example.entity.Bid;
import com.example.repository.BidRepository;

import java.sql.SQLException;
import java.util.List;

public class BidService {
    private final BidRepository bidRepository = new BidRepository();

    public BidService() throws SQLException {
    }

    public void add(int size, int buyerId, int productId) throws SQLException {
        bidRepository.save(Bid.builder().size(size).buyerId(buyerId).productId(productId).build());
    }

    public List<Bid> get() {
        return bidRepository.get();
    }
}