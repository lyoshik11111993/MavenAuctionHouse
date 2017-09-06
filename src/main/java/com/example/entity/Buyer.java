package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Buyer {
    private int id;
    private String name;
    
    @Override
    public String toString(){
        return "Id = " + getId()+ " | Name = " + getName();
    }
}
