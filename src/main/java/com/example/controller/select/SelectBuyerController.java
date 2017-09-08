package com.example.controller.select;

import com.example.entity.Buyer;
import com.example.services.BuyerService;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
import java.util.List;

public class SelectBuyerController {
    private final BuyerService buyerService = new BuyerService();
    @FXML
    private TableView<Buyer> buyers;

    @FXML
    private TableColumn<Buyer, Integer> buyerId;

    @FXML
    private TableColumn<Buyer, String> buyerName;

    public SelectBuyerController() throws SQLException {
    }

    public void initialize() {
        buyerId.setCellValueFactory(
                new PropertyValueFactory<Buyer, Integer>("Id"));
        buyerName.setCellValueFactory(
                new PropertyValueFactory<Buyer, String>("Name"));
        fillBuyersTable();
    }

    private void fillBuyersTable() {
        List<Buyer> buyerList = buyerService.get();
        buyers.setItems(FXCollections.observableArrayList(buyerList));
    }
}
