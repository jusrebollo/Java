package edu.bu.met.cs665;

/**
 Tea extends coffee and overwrites the NewDrink method to allow for the different drinkType to reflect as tea.
 Tea inherits the remaining coffee functions
 */

public class Tea extends Coffee {


    int milkCount = 0;
    int sugarCount = 0;
    int drink_id = 0;
    boolean isTea = true;


    @Override
    public String NewDrink(String drinkName) {
        drinkType = drinkName;
        drink_id += 1;
        return drinkType;
    }

    @Override
    public double DrinkPrice() {

        return DrinkPrice - 0.50;
    }


}
