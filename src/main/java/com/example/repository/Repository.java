package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Repository extends ConnectionRepository{
    public ResultSet executeQuery(String sql){
        try {
            Connection connection = getConntection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            return  preparedStatement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int update(String sql, String ... params){
        try {
            Connection connection = getConntection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            if (sql.contains("?")) {
                int j = 1;
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setString(j, params[i]);
                    j++;
                }
                return  preparedStatement.executeUpdate();
            } else {
                return preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void reset() throws SQLException {
        Connection connection = getConntection();
        PreparedStatement productReset = connection.prepareStatement("DELETE FROM Product WHERE ID>10");
        productReset.executeUpdate();
        PreparedStatement bidReset = connection.prepareStatement("DELETE FROM Bid WHERE ID>10");
        bidReset.executeUpdate();
        PreparedStatement sellerReset = connection.prepareStatement("DELETE FROM Seller WHERE ID>5");
        sellerReset.executeUpdate();
        PreparedStatement buyerReset = connection.prepareStatement("DELETE FROM Buyer WHERE ID>10");
        buyerReset.executeUpdate();
    }
}
