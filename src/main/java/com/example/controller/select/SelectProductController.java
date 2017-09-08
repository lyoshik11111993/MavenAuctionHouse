package com.example.controller.select;

import com.example.entity.Product;
import com.example.services.ProductService;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
import java.util.List;

public class SelectProductController {
    private final ProductService productService = new ProductService();

    @FXML
    private TableView<Product> products;

    @FXML
    private TableColumn<Product, Integer> productId;

    @FXML
    private TableColumn<Product, String> productName;

    @FXML
    private TableColumn<Product, Integer> productSellerId;

    public SelectProductController() throws SQLException {
    }

    public void initialize() {
        productId.setCellValueFactory(
                new PropertyValueFactory<Product, Integer>("id"));
        productName.setCellValueFactory(
                new PropertyValueFactory<Product, String>("name"));
        productSellerId.setCellValueFactory(
                new PropertyValueFactory<Product, Integer>("seller_id"));
        fillProductsTable();
    }

    private void fillProductsTable() {
        List<Product> productList = productService.get();
        products.setItems(FXCollections.observableArrayList(productList));
    }
}
