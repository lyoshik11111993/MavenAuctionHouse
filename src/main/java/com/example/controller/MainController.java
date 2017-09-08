package com.example.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainController {

    @FXML
    private Pane selectPane;

    @FXML
    private void insert() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("insert.fxml"));
        selectPane.getChildren().setAll(root);
    }
}
