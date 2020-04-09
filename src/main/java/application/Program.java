/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author psoar
 */

import domainModules.Product;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter product data");
        System.out.print("Name: ");
        String name=in.nextLine();
        System.out.print("Price: ");
        double price=in.nextDouble();

        
        Product product = new Product(name, price);
        
        System.out.print("\nProduct Data");                   
        product.showInfo();        
        System.out.print("\nAdd Stock: ");
        product.addProducts(in.nextInt());
        //product.setName("Computer");
        //product.setPrice(1100.99);
        System.out.print("\nUpdated Data");
        product.showInfo();
        System.out.print("\n Remove Stock: ");
        product.removeProduct(in.nextInt());
        System.out.print("\nUpdated Data");
        
        product.showInfo();

        in.close();
    }
    
}
