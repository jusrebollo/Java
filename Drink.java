package edu.bu.met.cs665;

/**
Drink is the interface which Coffee and Tea inherit from.
 It has functions: NewDrink, CheckCondiments, Milk, Sugar, MilkCount, SugarCount

  */


public interface Drink {

    int drink_id = 0;

    // creates the drink
    public String NewDrink(String drinkName);

    // Checks overall condiment count
    public int CheckCondiments();

    // Adds milk to the drink
    public String Milk();

    // Adds sugar to the drink
    public String Sugar();

    // Checks the count of Milks
    public int MilkCount();

    // Checks the count of sugars
    public int SugarCount();

    // Returns the price of the drink
    public double DrinkPrice();



}
