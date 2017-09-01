package com.example.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Bid {
    private int id;
    private int size;
    public int productId;
    public int buyerId;
    
    @Override
    public String toString(){
        return "Id = " + getId()+ " | Bid`s Size = " + getSize() +
                " | Product`s Id = " + getProductId() + " | Buyer`s Id = " + getBuyerId();
    }
}
