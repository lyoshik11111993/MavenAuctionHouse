package com.example.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Seller {
    private int id;
    private String name;

    @Override
    public String toString(){
        return "Id = " + getId()+ " | Name = " + getName();
    }
}
