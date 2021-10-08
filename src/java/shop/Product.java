/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

/**
 *
 * @author LENOVO
 */
public abstract class Product {
    private String name;
    private double price;
    
    public Product(){
        
    }
    
    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    
    public String toString(){
        return name + " " + price;
    }
}
