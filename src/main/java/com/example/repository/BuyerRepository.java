package com.example.repository;

import com.example.entity.Buyer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuyerRepository extends ConnectionRepository {

    public BuyerRepository() throws SQLException {
    }

    public void save(Buyer buyer) throws SQLException {
        try (Connection connection = getConntection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement("INSERT INTO buyer (name) VALUES (?)")) {
            preparedStatement.setString(1, buyer.getName());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Buyer> get() {
        try (Connection connection = getConntection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Buyer")) {
            return convert(preparedStatement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
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
}
