package com.example.controller.insert;

import com.example.services.BidService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddBidController {
    private final BidService bidService = new BidService();

    public AddBidController() throws SQLException {
    }

    @FXML
    private TextField insertTextFieldSize;

    @FXML
    private TextField getInsertTextFieldBuyerId;

    @FXML
    private TextField getGetInsertTextFieldProductId;

    @FXML
    private void addBid() throws SQLException {
        bidService.add(
                (Integer.parseInt(insertTextFieldSize.getText())),
                (Integer.parseInt(getInsertTextFieldBuyerId.getText())),
                (Integer.parseInt(getGetInsertTextFieldProductId.getText())));
    }
}
