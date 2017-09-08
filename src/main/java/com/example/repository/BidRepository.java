package com.example.repository;

import com.example.entity.Bid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BidRepository extends ConnectionRepository {

    public BidRepository() throws SQLException {
    }

    public void save(Bid bid) throws SQLException {
        try (Connection connection = getConntection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement("INSERT INTO product(size, buyer_id, product_id) VALUES (?, ?, ?)")) {
            preparedStatement.setInt(1, bid.getSize());
            preparedStatement.setInt(2, bid.getBuyerId());
            preparedStatement.setInt(3, bid.getProductId());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Bid> get() {
        try (Connection connection = getConntection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM bid")) {
            return convert(preparedStatement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
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
}
