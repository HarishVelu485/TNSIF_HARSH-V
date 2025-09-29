package com.tnsif.entityassignment;

import java.util.Scanner;

public class Mainc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[3];

        // Collect 3 product details
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();

            products[i] = new Product(id, name, price);
            System.out.println();
        }

        // Display all products
        System.out.println("=== Product Details ===");
        for (Product p : products) {
            p.displayProduct();
        }

        sc.close();
    }
}
