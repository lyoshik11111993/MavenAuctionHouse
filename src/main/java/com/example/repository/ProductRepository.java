package com.example.repository;

import com.example.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository extends ConnectionRepository {

    public ProductRepository() throws SQLException {
    }

    public void save(Product product) throws SQLException {
        try (Connection connection = getConntection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement("INSERT INTO product(name, seller_id) VALUES (?, ?)")) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getSellerId());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Product> get() {
        try (Connection connection = getConntection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM product")) {
            return convert(preparedStatement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public List<Product> convert(ResultSet resultSet) throws SQLException {
        List<Product> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(convertSingle(resultSet));
        }
        return list;
    }

    private Product convertSingle(ResultSet resultSet) throws SQLException{
        return new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3));
    }
}
