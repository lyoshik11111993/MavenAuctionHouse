package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application{
    SceneCreater sceneCreater = new SceneCreater();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Auction House");
        primaryStage.setScene(sceneCreater.createScene("../../main.fxml"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
