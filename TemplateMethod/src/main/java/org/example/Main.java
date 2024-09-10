package org.example;
/*
22. **Template Method Pattern:** Defines the skeleton of an algorithm in the superclass but lets subclasses alter
specific steps of the algorithm without changing its structure.
* */
public class Main {
    public static void main(String[] args) {
        AbstractCoffeeTemplate coffee = new CoffeeWithHook();
        coffee.makeCoffee();
    }
}