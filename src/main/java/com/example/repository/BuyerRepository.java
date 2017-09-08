package com.example.repository;

import com.example.entity.Buyer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BuyerRepository extends Repository{

    public BuyerRepository() throws SQLException {
    }

    public List<Buyer> convert(ResultSet resultSet) throws SQLException {
        List<Buyer> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(convertSingle(resultSet));
        }
        return list;
    }

    private Buyer convertSingle(ResultSet resultSet) throws SQLException{
        return new Buyer(resultSet.getInt(1), resultSet.getString(2));
    }

    public void buyerInsert(String x){
        update("INSERT INTO Buyer (`Name`) VALUES (?)", x);
    }
}
