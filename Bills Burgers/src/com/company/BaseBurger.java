package com.company;
import java.util.*;

public class BaseBurger {
    String name;
    double price;
    String breadRoll;
    String meat;

    List<Ingredient> ingredient=new ArrayList<>();

    public BaseBurger(String name, double price, String breadRoll, String meat){
        this.name=name;
        this.price=price;
        this.breadRoll=breadRoll;
        this.meat=meat;
    }

    public void addIngredient(Ingredient i){
        if (ingredient.size() <= 4) {
            ingredient.add(i);
            System.out.println("An ingredient was added: " + i);
        }
    }

    public double calculateTotal(){
        System.out.println(this.name+" with "+this.meat+" has a "+this.breadRoll+" roll "+ "and the price is "+this.price+" lei.");
        double burgerTotalPrice=this.price;
        for(Ingredient i:ingredient){
            burgerTotalPrice+=i.priceIngredient;
        }
        return burgerTotalPrice;
    }
}
