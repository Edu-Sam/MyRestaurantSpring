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
import shop.Battery;
import shop.Disc;
import shop.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;


@Configuration
@ComponentScan("shop")
public class ShopConfiguration {
    
    @Bean
    public Product aaa(){
        Battery p1=new Battery("AAA",2.5);
        p1.setRechargeable(true);
        return p1;
    }
    
    @Bean
    public Product cdrw(){
        Disc p2=new Disc("CD-RW",1.5);
        p2.setCapacity(700);
        return p2;
    }
    
    @Bean
    public Product dvdrw(){
        Disc p2=new Disc("DVD-RW",3.0);
        p2.setCapacity(700);
        return p2;
    }
    
}
