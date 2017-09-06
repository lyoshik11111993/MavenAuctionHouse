package com.example.controller;

import com.example.SceneCreater;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import java.io.IOException;

public class MainController {
    private final SceneCreater sceneCreater = new SceneCreater();

//    private final Seller seller = new Seller();

    @FXML
    private Button insertBtn;

    @FXML
    private Button updateBtn;

    @FXML
    private Button selectBtn;

    @FXML
    private Button deleteBtn;

    @FXML
    private void insert(ActionEvent event) throws IOException {
        Scene sceneInsert = sceneCreater.createScene("../../insert.fxml");
    }
}
