package org.example;
// Concrete subclass implementing the template methods
public class CoffeeWithHook extends AbstractCoffeeTemplate{
    @Override
    protected void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    protected void brewCoffeeGrounds() {
        System.out.println("Brewing coffee grounds");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Pouring coffee into cup");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
