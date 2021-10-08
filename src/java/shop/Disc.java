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
public class Disc extends Product{
    
    private int capacity;
    
    public Disc(){
        super();
    }
    
    public Disc(String name,double price){
        super(name,price);
    }
    
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
}
