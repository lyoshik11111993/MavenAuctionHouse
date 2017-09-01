package com.example.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int sellerId;

    @Override
    public String toString(){
        return "Id = " + getId()+ " | Name = " + getName() + " | Seller`s Id = " + getSellerId();
    }
}
