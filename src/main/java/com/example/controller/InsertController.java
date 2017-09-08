package com.example.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

import java.io.IOException;


public class InsertController {

    @FXML
    private MenuButton insertMenuBtn;

    @FXML
    private MenuItem sellerBtn;

    @FXML
    private MenuItem buyerBtn;

    @FXML
    private MenuItem productBtn;

    @FXML
    private MenuItem bidBtn;

    @FXML
    private Pane workPane;

    @FXML
    private void goToAddSeller() throws IOException {
//        workPane.getChildren().removeAll(workPane);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("insert/addSeller.fxml"));
        workPane.getChildren().addAll(root);
        insertMenuBtn.setText(sellerBtn.getText());
    }

    @FXML
    private void goToAddBuyer() throws IOException {
//        workPane.getChildren().removeAll(workPane);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("insert/addBuyer.fxml"));
        workPane.getChildren().addAll(root);
        insertMenuBtn.setText(buyerBtn.getText());
    }

    @FXML
    private void goToAddProduct() throws IOException {
//        workPane.getChildren().removeAll(workPane);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("insert/addProduct.fxml"));
        workPane.getChildren().addAll(root);
        insertMenuBtn.setText(productBtn.getText());
    }

    @FXML
    private void goToAddBid() throws IOException {
//        workPane.getChildren().removeAll(workPane);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("insert/addBid.fxml"));
        workPane.getChildren().addAll(root);
        insertMenuBtn.setText(bidBtn.getText());
    }
}
