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
public class Battery extends Product{
    
    private boolean rechargeable;
    
    public Battery(){
        super();
    }
    
    public Battery(String name,double price){
       super(name,price);    
    }
    
    public void setRechargeable(boolean rechargeable){
        this.rechargeable=rechargeable;
    }
    
    public boolean getRechargeable(){
        return this.rechargeable;
    }
}
