package com.example.repository;

import com.example.entity.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SellerRepository extends ConnectionRepository {

    public SellerRepository() throws SQLException {
    }

    public void save(Seller seller) throws SQLException {
        try (Connection connection = getConntection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement("INSERT INTO seller (name) VALUES (?)")) {
            preparedStatement.setString(1, seller.getName());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Seller> get() {
        try (Connection connection = getConntection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Seller")) {
            return convert(preparedStatement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public List<Seller> convert(ResultSet resultSet) throws SQLException {
        List<Seller> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(convertSingle(resultSet));
        }
        return list;
    }

    private Seller convertSingle(ResultSet resultSet) throws SQLException{
        return new Seller(resultSet.getInt(1), resultSet.getString(2));
    }
}
