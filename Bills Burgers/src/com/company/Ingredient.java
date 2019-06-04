package com.company;

public class Ingredient {
    String nameIngredient;
    double priceIngredient;

    public Ingredient(String nameIngredient, double priceIngredient){
        this.nameIngredient=nameIngredient;
        this.priceIngredient=priceIngredient;
    }

    @Override
    public String toString(){
        return this.nameIngredient+" and the price is "+this.priceIngredient+" lei.";
    }
}
