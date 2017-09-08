package com.example.repository;

import com.example.entity.Bid;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BidRepository extends Repository{

    public BidRepository() throws SQLException {
    }

    public List<Bid> convert(ResultSet resultSet) throws SQLException {
        List<Bid> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(convertSingle(resultSet));
        }
        return list;
    }

    private Bid convertSingle(ResultSet resultSet) throws SQLException{
        return new Bid(resultSet.getInt(1), resultSet.getInt(2),
                resultSet.getInt(3), resultSet.getInt(4));
    }

    public void bidInsert(String x, String y, String z){
        update("INSERT INTO Bid (`size`, `product_id`, `buyer_id`) VALUES (?, ?, ?)", x, y, z);
    }
}
