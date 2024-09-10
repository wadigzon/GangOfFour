package org.example;
/*
11. **Flyweight Pattern:** Minimizes memory usage or computational expenses by sharing as much as possible
with related objects.
* */
public class Main {
    public static void main(String[] args) {
        CoffeeFlavorFactory flavorFactory = new CoffeeFlavorFactory();

        // Creating and serving coffee flavors
        CoffeeOrder coffee1 = flavorFactory.getCoffeeFlavor("Espresso");
        coffee1.serveCoffee(new CoffeeContext(1));

        CoffeeOrder coffee2 = flavorFactory.getCoffeeFlavor("Cappuccino");
        coffee2.serveCoffee(new CoffeeContext(2));

        CoffeeOrder coffee3 = flavorFactory.getCoffeeFlavor("Espresso");
        coffee3.serveCoffee(new CoffeeContext(3));

        // Note: Even though 'Espresso' is served twice, it uses the same CoffeeFlavor instance
    }
}