package com.example.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

import java.io.IOException;


public class SelectController {

    @FXML
    private MenuButton selectMenuBtn;

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
    private void showSellers() throws IOException {
        workPane.getChildren().removeAll(workPane);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("select/selectSeller.fxml"));
        workPane.getChildren().addAll(root);
        selectMenuBtn.setText(sellerBtn.getText());
    }

    @FXML
    private void showBuyers() throws IOException {
        workPane.getChildren().removeAll(workPane);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("select/selectBuyer.fxml"));
        workPane.getChildren().addAll(root);
        selectMenuBtn.setText(buyerBtn.getText());
    }

    @FXML
    private void showProducts() throws IOException {
        workPane.getChildren().removeAll(workPane);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("select/selectProduct.fxml"));
        workPane.getChildren().addAll(root);
        selectMenuBtn.setText(productBtn.getText());
    }

    @FXML
    private void showBids() throws IOException {
        workPane.getChildren().removeAll(workPane);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("select/selectBid.fxml"));
        workPane.getChildren().addAll(root);
        selectMenuBtn.setText(bidBtn.getText());
    }
}
