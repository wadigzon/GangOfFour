package org.example;
/*
9. **Decorator Pattern:** Attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.
* */
public class Main {
    public static void main(String[] args) {
        // Creating a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: $" + simpleCoffee.cost() + ", Description: " + simpleCoffee.description());

        // Decorating the simple coffee with Milk
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: $" + milkCoffee.cost() + ", Description: " + milkCoffee.description());

        // Decorating the simple coffee with Sugar
        Coffee sweetCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Cost: $" + sweetCoffee.cost() + ", Description: " + sweetCoffee.description());

        // Decorating the simple coffee with Milk and Sugar
        Coffee sweetMilkCoffee = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Cost: $" + sweetMilkCoffee.cost() + ", Description: " + sweetMilkCoffee.description());

    }
}