package com.example.controller.select;

import com.example.entity.Seller;
import com.example.services.SellerService;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
import java.util.List;

public class SelectSellerController {

    private final SellerService sellerService = new SellerService();

    public SelectSellerController() throws SQLException {
    }

    @FXML
    private TableView<Seller> sellers;

    @FXML
    private TableColumn<Seller, Integer> sellerId;

    @FXML
    private TableColumn<Seller, String> sellerName;

    public void initialize() {
        sellerId.setCellValueFactory(
                new PropertyValueFactory<Seller, Integer>("Id"));
        sellerName.setCellValueFactory(
                new PropertyValueFactory<Seller, String>("Name"));
        fillSellersTable();
    }

    private void fillSellersTable() {
        List<Seller> sellerList = sellerService.get();
        sellers.setItems(FXCollections.observableArrayList(sellerList));
    }
}
