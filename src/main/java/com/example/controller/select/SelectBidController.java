package com.example.controller.select;

import com.example.entity.Bid;
import com.example.services.BidService;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
import java.util.List;

public class SelectBidController {
    private final BidService bidService = new BidService();

    @FXML
    private TableView<Bid> bids;

    @FXML
    private TableColumn<Bid, Integer> bidId;

    @FXML
    private TableColumn<Bid, Integer> bidSize;

    @FXML
    private TableColumn<Bid, Integer> bidBuyerId;

    @FXML
    private TableColumn<Bid, Integer> bidProductId;

    public SelectBidController() throws SQLException {
    }

    public void initialize() {
        bidId.setCellValueFactory(
                new PropertyValueFactory<Bid, Integer>("id"));
        bidSize.setCellValueFactory(
                new PropertyValueFactory<Bid, Integer>("size"));
        bidBuyerId.setCellValueFactory(
                new PropertyValueFactory<Bid, Integer>("buyer_id"));
        bidProductId.setCellValueFactory(
                new PropertyValueFactory<Bid, Integer>("product_id"));
        fillBidsTable();
    }

    private void fillBidsTable() {
        List<Bid> bidList = bidService.get();
        bids.setItems(FXCollections.observableArrayList(bidList));
    }
}
