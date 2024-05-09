package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class StoreApp {


    // Display menu and get user choice until they choose to exit
        while (int choice != 3) {
        System.out.println("Welcome to the Online Store!");
        System.out.println("1. Show Products");
        System.out.println("2. Show Cart");
        System.out.println("3. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine();

        // Call the appropriate method based on user choice
        switch (choice) {
            case 1:
                displayProducts(inventory, cart, scanner);
                break;
            case 2:
                displayCart(cart, scanner,  double totalAmount);
                break;
            case 3:
                System.out.println("Thank you for shopping with us!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}

public class InventoryLoader {
    public static void loadInventory(String fileName, ArrayList<Product> inventory) {
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) }

    while ((line = br.readLine()) !=
null)
    private final String line;

    {
            String[] parts =
line.split(",");
                if (parts.length ==3) {
                    String id = parts[0];
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    line.add(new Product(id, name, price));
                } else {
                    System.err.println("Invalid line formate: " + line);
                    }
                }
} catch (IOException e) {
        }

        public static void main(String[] args) {
            ArrayList<Product> inventory = new ArrayList<>();
            loadInventory("products.csv" , inventory);
            System.out.println("Inventory loaded successfully");
        }



