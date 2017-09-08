package com.example.controller.insert;

import com.example.services.BuyerService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddBuyerController {
    private final BuyerService buyerService = new BuyerService();

    public AddBuyerController() throws SQLException {
    }

    @FXML
    private TextField insertTextField;

    @FXML
    private void addBuyer() throws SQLException {
        buyerService.add(insertTextField.getText());
    }
}
