package org.example;

/*
2.Factory Method Pattern:
Defines an interface for creating an object but lets subclasses alter the type of objects that will be created.
* */
public class Main {
    public static void main(String[] args) {
        // Create an instance of ConcreteCreator1
        Creator creator1 = new ConcreteCreator1();
        // Use the factory method to create a ConcreteProduct1
        Product product1 = creator1.factoryMethod();
        // Call the create method on the created product
        product1.create();

        // Create an instance of ConcreteCreator2
        Creator creator2 = new ConcreteCreator2();
        // Use the factory method to create a ConcreteProduct2
        Product product2 = creator2.factoryMethod();
        // Call the create method on the created product
        product2.create();
    }
}