package com.example;

import java.sql.*;

public class SQLRequest {
    private final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AuctionHouse?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
            "root", "");

    public SQLRequest() throws SQLException {
    }

    public ResultSet executeQuery(String sql){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            return  preparedStatement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int update(String sql, String ... params){
        try {
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
