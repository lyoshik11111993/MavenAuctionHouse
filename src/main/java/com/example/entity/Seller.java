package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Seller {
    private int id;
    private String name;

    @Override
    public String toString(){
        return "Id = " + getId()+ " | Name = " + getName();
    }
}
