package edu.bu.met.cs665;


// Implementation of the Vending Machine and creation of coffee and tea drinks with sugar and coffee
public class VendingMachine {

    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        Tea tea1 = new Tea();

        System.out.println(coffee1.NewDrink("Americano"));
        System.out.println(tea1.NewDrink("Green Tea"));
        System.out.println(tea1.Milk());
        System.out.println(tea1.Milk());
        System.out.println(coffee1.Milk());
        System.out.println(tea1.Milk());
        System.out.println(tea1.Sugar());
        System.out.println(tea1.DrinkPrice());


    }




}
