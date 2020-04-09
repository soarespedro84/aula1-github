/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainModules;

import java.util.Date;

/**
 *
 * @author psoar
 */
public class Order {
    
    private Date date;
    private Product product;

    public Order(Date date, Product product) {
        super();
        this.date = date;
        this.product = product;
        this.product.name="TV";
    }
    
    public Order(){
        
    }

    public Date getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
}
