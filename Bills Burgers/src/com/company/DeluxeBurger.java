package com.company;

public class DeluxeBurger extends BaseBurger{

    public DeluxeBurger(){
        super("Deluxe Burger", 35, "cereals", "sausage and bacon");
        super.addIngredient(new Ingredient("chips", 5));
        super.addIngredient(new Ingredient("drink", 4));
    }

    @Override
    public void addIngredient(Ingredient i){
        System.out.println("You cannot add extra ingredients to the Deluxe Burger.");
    }

}
