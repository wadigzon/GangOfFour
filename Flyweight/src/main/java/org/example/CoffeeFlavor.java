package org.example;
// Concrete Flyweight
public class CoffeeFlavor implements CoffeeOrder {
    private final String flavor;

    public CoffeeFlavor(String flavor) {
        this.flavor = flavor;
    }
    @Override
    public void serveCoffee(CoffeeContext context) {
        System.out.println("Serving coffee flavor '" + flavor + "' to table number " + context.getTableNumber());
    }
}
