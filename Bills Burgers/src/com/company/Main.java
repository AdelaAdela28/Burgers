package com.company;

public class Main {

    public static void main(String[] args) {

        /* Application to help the company called 'Bills Burgers' to manage their process of selling hamburgers.
        Through this application you can select types of burgers and some of the additional items (additions) to
        be added to the burgers and pricing.

        We have a base hamburger, with a base price.
        It also has the following items: Bread roll type, meat and up to 4 additional items (things like lettuce, tomato, carrot, etc)
        that the customer can select to be added to the burger.

        Each of the additional items has its own price, so we have a method to track how many items got added
        and calculate the final price (base burger with all the additions).

        We have two extra varieties of Hamburgers:
        1. Healthy burger (on a brown rye bread roll), plus two additional items that can be added, so you can have 6 additional items in total.

        2. Deluxe hamburger comes with chips and drink as additional items, but no extra additions are allowed.

        All 3 classes have a method that can be called anytime to show the base price of the hamburger, plus all additional items,
        each showing the additional item's name+price and a final total for the burger (base price + all additions).
        */

        BaseBurger burger=new BaseBurger("Basic Burger",20.5, "white", "sausage");
        System.out.println("Total price of your basic burger is: "+burger.calculateTotal()+" lei.");
        System.out.println("------------------------------------------------------------------------");

        Ingredient i1=new Ingredient("tomato",1.5);
        burger.addIngredient (i1);

        Ingredient i2=new Ingredient("cheese",2);
        burger.addIngredient (i2);

        Ingredient i3=new Ingredient("garlic",1);
        burger.addIngredient (i3);

        System.out.println("Total price of your burger is: "+burger.calculateTotal()+" lei.");
        System.out.println("------------------------------------------------------------------------");

        HealthyBurger healthyBurger=new HealthyBurger(25,"fish");
        healthyBurger.addIngredient (i1);
        Ingredient i4=new Ingredient("egg",2);
        healthyBurger.addHealthyIngredient (i4);

        System.out.println("Total price of your healthy burger is: "+healthyBurger.calculateTotal()+" lei.");
        System.out.println("-------------------------------------------------------------------------");

        DeluxeBurger deluxeBurger=new DeluxeBurger();
        deluxeBurger.addIngredient (i3);
        System.out.println("Total price of your deluxe burger is: "+deluxeBurger.calculateTotal()+" lei.");

    }
}
