package org.example;
// Abstract class defining the template method
abstract class AbstractCoffeeTemplate {
    // Template method
    public final void makeCoffee() {
        boilWater();
        brewCoffeeGrounds();
        pourInCup();
        addCondiments();
        System.out.println("Coffee is ready!");
    }

    // Methods to be implemented by subclasses
    protected abstract void boilWater();

    protected abstract void brewCoffeeGrounds();

    protected abstract void pourInCup();

    protected abstract void addCondiments();
}
