package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// These are unit tests to test the functionality of the Coffee and Tea classes

public class TestDrinks {

  public TestDrinks() {}


  // Tests if the correct Coffee name is created when brewed
  @Test
  public void testCoffeeName() {

    Coffee coffee1 = new Coffee();
    assertEquals("Latte Macchiato", coffee1.NewDrink("Latte Macchiato"));

  }

  // Tests if the correct Tea name is created when brewed

  @Test
  public void testTeaName() {

    Coffee coffee1 = new Coffee();
    assertEquals("Green Tea", coffee1.NewDrink("Green Tea"));

  }


  // Tests the milk method to ensure the milk count iterates when a milk is added for Coffee Drinks

  @Test
  public void testMilkCoffee() {

    Coffee coffee1 = new Coffee();
    coffee1.NewDrink("Americano");
    coffee1.Milk();
    assertEquals(1, coffee1.MilkCount());

  }

  // Tests the milk method to ensure the milk count iterates when a milk is added for Tea Drinks
  @Test
  public void testMilkTea() {

    Tea tea1 = new Tea();
    tea1.NewDrink("Black Tea");
    tea1.Milk();
    tea1.Milk();
    tea1.Milk();
    assertEquals(3, tea1.MilkCount());

  }


  // Tests the sugar method to ensure the milk count iterates when a milk is added for Coffee Drinks
  @Test
  public void testSugarCoffee() {

    Coffee coffee1 = new Coffee();
    coffee1.NewDrink("Espresso");
    coffee1.Sugar();
    coffee1.Sugar();
    assertEquals(2, coffee1.SugarCount());

  }


  // Tests the sugar method to ensure the milk count iterates when a milk is added for Tea Drinks
  @Test
  public void testSugarTea() {

    Tea tea1 = new Tea();
    tea1.NewDrink("Yellow Tea");
    tea1.Sugar();
    tea1.Sugar();
    assertEquals(2, tea1.SugarCount());

  }

  //tests if the correct price is calculated after adding condiments
  @Test
  public void testPrice() {

    Tea tea1 = new Tea();
    tea1.NewDrink("Yellow Tea");
    tea1.Sugar();
    tea1.Sugar();
    assertEquals(1.70, tea1.DrinkPrice(), 0.00001);

  }


}
