/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainModules;

/**
 *
 * @author psoar
 */
public class Product {
    
    String name;
    private double price;
    private int quant;
    
    public Product(){
        
    }
    
    public Product(String name, double price, int quant){
        this.name=name;
        this.price=price;
        this.quant=quant;
    }
    
    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }    
  
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQuant(){
        return quant;
    }
    public double totalValueStock(){
        return price*quant;
    }
    public void addProducts(int quant){
        this.quant += quant;
    }
    public void removeProduct(int quant){
        this.quant -= quant;
    }
    public void showInfo(){
        System.out.println("\nName: "+ name + "\nPrice: € "+ String.format("%.2f", price) +"\nIn Stock: " + quant
        + "\nValue in Stock: € "+ String.format("%.2f", totalValueStock()));

    }
}
