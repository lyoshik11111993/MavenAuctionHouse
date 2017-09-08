package com.example.controller;

import com.example.repository.ResetRepository;
import javafx.fxml.FXML;

import java.sql.SQLException;

public class DeleteController {
    ResetRepository resetRepository = new ResetRepository();

    @FXML
    private void delete() throws SQLException {
        resetRepository.reset();
    }
}
