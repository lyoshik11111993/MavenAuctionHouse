package com.example.controller.insert;

import com.example.services.SellerService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;


public class AddSellerController {
    SellerService sellerService;

    @FXML
    private TextField insertTextField;

    @FXML
    private void addSeller() throws SQLException {
        sellerService.add(insertTextField.getText());
    }
}
