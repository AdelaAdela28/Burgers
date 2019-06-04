package com.company;
import java.util.*;

public class HealthyBurger extends BaseBurger{
    List<Ingredient> ingredient=new ArrayList<>();

    public HealthyBurger(double price, String meat){
        super("Healthy Burger", price,"brown rye", meat);
    }

    public void addHealthyIngredient(Ingredient i){
        if (ingredient.size() <= 6) {
            ingredient.add(i);
            System.out.println("A healthy ingredient was added: " + i);
        }
    }

    @Override
    public double calculateTotal(){
        double healthyBurgerPrice=super.calculateTotal();
        for(Ingredient i:ingredient){
            healthyBurgerPrice+=i.priceIngredient;
        }
        return healthyBurgerPrice;
    }
}
