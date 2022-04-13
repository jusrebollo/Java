package edu.bu.met.cs665;

/**
 Coffee implements the methods from Drink: NewDrink, CheckCondiments, Milk, Sugar, MilkCount, SugarCount

 */

public class Coffee implements Drink {

    // need variables for each Coffee object
    String drinkType ;
    int drink_id = 0;
    int milkCount = 0;
    int sugarCount = 0;
    boolean isCoffee = true;

    double DrinkPrice = 2.00;
    double MilkPrice = 0.50;
    double SugarPrice = 0.10;

    // Returns the drink name to confirm the name of created drink
    @Override
    public String NewDrink(String drinkName ) {
        drinkType = drinkName;
        drink_id += 2;
        return drinkType;
    }

    // checks the overall condiment count
    @Override
    public int CheckCondiments() {
        // return the total condiment count
        return milkCount + sugarCount;

    }

    // returns the milk count
    @Override
    public int MilkCount() {
        // return the total condiment count
        return milkCount;

    }

    // returns the sugar count
    @Override
    public int SugarCount() {
        // return the total condiment count
        return sugarCount;

    }

    // checks the milk count is under 3

    @Override
    public String Milk() {

        if (milkCount < 3)
        {
            milkCount +=1;
            DrinkPrice = DrinkPrice + 0.50;
        }

        else
        {
            return "Too many milks";
        }



        return "There are " + milkCount + " milks in the coffee";
    }


    // checks the sugar count is under 3

    @Override
    public String Sugar() {
        if (sugarCount < 3)
        {
            sugarCount +=1;
            DrinkPrice = DrinkPrice + 0.10;
        }
        else
        {
            return "Too many sugars";
        }

        return "There are " + sugarCount + " sugars in the drink.";

        }

        //Returns the drink price
        @Override
        public double DrinkPrice(){

            return DrinkPrice;
        }
}
