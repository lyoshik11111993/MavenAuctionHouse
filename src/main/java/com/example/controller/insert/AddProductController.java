package com.example.controller.insert;

import com.example.services.ProductService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddProductController {
    private final ProductService productService = new ProductService();

    public AddProductController() throws SQLException {
    }

    @FXML
    private TextField insertTextFieldName;

    @FXML
    private TextField insertTextFieldId;

    @FXML
    private void addProduct() throws SQLException {
        productService.add(insertTextFieldName.getText(), (Integer.parseInt(insertTextFieldId.getText())));
    }
}
