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
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;
import org.springframework.context.annotation.Scope;

@Component
@Scope("prototype")
public class ShoppingCart {

private List<Product> items=new ArrayList<>();  

public void addItem(Product item){
    items.add(item);
}

public List<Product> getItems(){
    return items;
}
}
