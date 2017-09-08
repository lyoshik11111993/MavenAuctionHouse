package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResetRepository extends ConnectionRepository{

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
