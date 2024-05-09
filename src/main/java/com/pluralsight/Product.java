package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

java.util.ArrayList<Product>  cart:

public class Product {

   private String id;
   private String name;
   private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

public static void displayProducts(ArrayList<Product> inventory, ArrayList<Product> cart, Scanner scanner) {
    System.out.println("Available Prducts: ");
    System.out.println("ID\tName\tPrice");
    for (Product product : inventory) {
        System.out.println(product.getId() + "\t" + product.getName() + "\t$" + product.getPrice());
    }

    while (true) {
        System.out.println("Enter ID of the product you want to add to cart"):");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("done")) {
            break;
        }
    }
    // Search for product in the inventory ID
    Product selectedProduct = null;
    for (Product product : inventory) {
        if (product.getId().equalsIgnoreCase(String inventory)) {
            break;
        }
    }

    Product selectedProduct = null;
    if (selectedProduct != null) {
        // Add product to cart
        cart.add(selectedProduct);
        System.out.println(selectedProduct.getName() + " has been added to cart");
    } else {
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>();

        ArrayList<Product> cart = new ArrayList<>();
        displayProducts(inventory, cart, scanner);

        scanner.close();


    public static void displayCart(ArrayList<Product> cart, Scanner scanner, double totalAmount) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;

            System.out.println("Your Cart:");
            System.out.println("ID\tName\tPrice");
            for (Product product : cart)
        }
        System.out.println(product.getId() + "\t" + product.getName() + "\t$" + product.getPrice());
    }
    System.out.println("Total : $" + totalAmount);

    while (true){
            System.out.

println("Enter ID of product you want to remove from cart( ' done' to finish): ");

String input = scanner.nextLine();
        if(input.

equalsIgnoreCase("done")){
        break;
        }

Product productToRemove = null;
        for(
Product product :cart){
productToRemove =product;
            break;
                    }
                    if(productToRemove !=null){
        cart.

remove(productToRemove);

totalAmount -=productToRemove.

getPrice();
     System.out.println.(productToRemove.

getName() +"has been removed from cart");

System.out,

println("updated total : $"+totalAmount);
     }else{

                        System.out.println.("invalid product ID. Please try again.");

                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);
                            ArrayList<Product> cart = new ArrayList<>();

                            double totalAmount = calculateTotalAmount(cart);
                            displayCart(cart, scanner, totalAmount);

                            scanner.close();

                            private static double calculateTotalAmount(ArrayList<Product> cart) {
                                double total = 0.0;
                                for (Product product : cart) {
                                    total += product.getPrice();

                                }
                                return total;


                                public static void checkOut(ArrayList<Product> cart, double totalAmount){

                                    System.out.println("confirm purchase? (yes/no): ");
                                    String input = scanner.nextLine();
                                    if (input.equalsIgnoreCase("yes")) {
                                        if (accountBalance >= totalAmount) {
                                            accountBalance -= totalAmount;
                                            System.out.println("purchase confirmed. total amount pf $" + totalAmount + " has been deducted from account.");
                                        }
                                    } else {
                                        System.out.println("insufficient funds. Purchase cannot be completed.");
                                    }
                                } else{
                                    System.out.println("Purchase cancelled");
                                }

                                public static Product findProductById(String id, ArrayList<Product> inventory){
                                    for (product product : inventory) {
                                        if (product.getId().equalsIngnoreCase(id)) {
                                            return product;
                                        }
                                    }
                                    return null; // no product with speciifed ID is found
                                }

                                public static void main(String[] args) {
                                    ArrayList<Product> inventory = new ArrayList<>();

                                    String productID = "AV1051" ; // product ID to search for product foundProduct = findProductById(productId, inventory);
                                    if (foundProduct != null) {
                                        System.out.println("Product found");
                                        System.out.println("ID: " + foundProduct.getID());
                                        System.out.println("Name: " + foundProduct.getName());
                                        System.out.println("Price : $" + foundProduct.getPrice());
                                    } else {
                                        System.out.println("Product with ID " + productID + "not found in inventory");
                                    }
                                    }
                                }




                                    // This method should search the inventory ArrayList for a product with
                                    // the specified ID, and return the corresponding Product object. If
                                    // no product with the specified ID is found, the method should return
                                    // null.
                                }




                                    }





