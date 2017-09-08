package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Product {
    private int id;
    private String name;
    private int sellerId;

    @Override
    public String toString(){
        return "Id = " + getId()+ " | Name = " + getName() + " | Seller`s Id = " + getSellerId();
    }
}
