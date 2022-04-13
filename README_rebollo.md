#Implementation Read Me
For implementing the automatic Vending Machine, I sought to use Interfaces, Inheritance and readable code to 
efficiently create the Vending Machine. 

#Assumptions 
For my implementation of the Vending Machine, I have taken several assumptions while abstracting and implementing the 
vending machine. First is that there is no user input from the command line. For implementation purposes, a drink name 
is given to simulate a user ordering a drink. This idea is applied to the other features of the vending machine ex. 
adding milk, adding sugar, and checking price. Additionally, it is assumed that the NewDrink() method represents the 
"brewing" or "making" of a drink. 

#Reusability 
To ensure the reusability of my code, I created the Drink interface which allows for any type of drink to be created, 
such as in this implementation coffee and tea, but the Interface Drink could be extended to create cold drinks or for 
prepackaged drinks instead. To add a new style of drink, one would simply have to implement Drink in a different fashion
or one could extend Coffee if it was fruitful to reuse the Coffee code. 

#Simplicity and Readability 
I ensured the code was readable and simple by creating simple variable names and method names that directly correlate 
with what they abstract/implement. For example MilkPrice refers to the price of milk or Milk() represents adding milk to 
a drink. 

#Flexibility 
Because of the Drink interface, there are many possible derived classes which are possible that can represent nearly any
needed drink type. In addition, the methods within Coffee can be adjusted to allow for differing types of condiments. 
