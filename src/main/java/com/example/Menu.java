package com.example;

import com.example.repository.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    SellerRepository sellerRepository = new SellerRepository();
    BuyerRepository buyerRepository = new BuyerRepository();
    ProductRepository productRepository = new ProductRepository();
    BidRepository bidConverter = new BidRepository();
    Repository repository = new Repository();
    Printer printer = new Printer();

    public Menu() throws SQLException {
    }

    public void menubar() throws SQLException {
        System.out.println("Press '1' to insert new sellers");
        System.out.println("Press '2' to insert new buyers");
        System.out.println("Press '3' to insert new products");
        System.out.println("Press '4' to insert new bids");
        System.out.println("Press '5' to show all categories");
        System.out.println("Press '6' to remove your additions");
        int selecter = scanner.nextInt();
        switch (selecter) {
            case 1:
                System.out.println("Add new Seller: ");
                String newSeller = scanner.next();
                sellerRepository.sellerInsert(newSeller);
                break;
            case 2:
                System.out.println("Add new Buyer: ");
                String newBuyer = scanner.next();
                buyerRepository.buyerInsert(newBuyer);
                break;
            case 3:
                System.out.println("Add new Product: ");
                String newProduct = scanner.next();
                System.out.println("Add Seller`s Id: ");
                String newSellerId = scanner.next();
                productRepository.productInsert(newProduct, newSellerId);
                break;
            case 4:
                System.out.println("Add new Bid: ");
                String newBid = scanner.next();
                System.out.println("Add Product`s Id: ");
                String newProductId = scanner.next();
                System.out.println("Add Buyer`s Id: ");
                String newBuyerId = scanner.next();
                bidConverter.bidInsert(newBid, newProductId, newBuyerId);
                break;
            case 5:
                System.out.println("There are all items of auction: ");
                System.out.println("SELLERS:");
                printer.print(sellerRepository.convert(repository.executeQuery("SELECT * FROM Seller")));
                System.out.println("BUYERS:");
                printer.print(buyerRepository.convert(repository.executeQuery("SELECT * FROM Buyer")));
                System.out.println("PRODUCTS:");
                printer.print(productRepository.convert(repository.executeQuery("SELECT * FROM product")));
                System.out.println("BIDS:");
                printer.print(bidConverter.convert(repository.executeQuery("SELECT * FROM bid")));
                break;
            case 6:
                repository.reset();
                break;
            case 0:
                System.out.println("Auction closed!");
                breaker();
                break;
            default:
                System.out.println("Enter right command!");
                break;
        }
    }

    public boolean breaker(){
        return true;
    }
}