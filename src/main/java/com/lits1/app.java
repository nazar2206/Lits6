package com.lits1;

import java.lang.reflect.Type;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class app {
    public static void main(String[] args) {
        ProductOrder bread = new ProductOrder(1, 10, 11,"name1");
        ProductOrder milk = new ProductOrder(2, 20, 22,"name2");
        ProductOrder TV = new ProductOrder(3, 30,33,"name3");
        ProductOrder a = new ProductOrder(4, 40,44,"name4");
        Set<ProductOrder> Product = new HashSet<ProductOrder>();
        Product.add(bread);
        Product.add(milk);
        Product.add(a);
        Product.add(TV);

        for(ProductOrder product : Product){
            if(product == bread ){
                System.out.println(bread + " "+ productType.FOOD + " " + productType.FOOD.getDescription());
            }
            else if (product == milk){
                System.out.println(milk + " " + productType.DRINK + " " + productType.DRINK.getDescription());
            }
            else if(product == TV){
                System.out.println(TV + " " + productType.ELECTRONICS + " " + productType.ELECTRONICS.getDescription());
            }
            else
                System.out.println("There is no product like this!");
        }

    }
}
