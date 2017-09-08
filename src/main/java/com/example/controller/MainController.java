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

    @FXML
    private void select() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("select.fxml"));
        selectPane.getChildren().setAll(root);
    }

    @FXML
    private void delete() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("delete.fxml"));
        selectPane.getChildren().setAll(root);
    }

    @FXML
    private void update() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("update.fxml"));
        selectPane.getChildren().setAll(root);
    }
}
