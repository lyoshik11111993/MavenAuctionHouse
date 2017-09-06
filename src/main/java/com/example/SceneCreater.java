package com.example;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class SceneCreater {
    public Scene createScene (String name) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(name));
        return new Scene(root, 1024, 720);
    }
}
