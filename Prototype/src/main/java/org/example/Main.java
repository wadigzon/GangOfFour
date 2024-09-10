package org.example;

/*
5.The Prototype pattern involves creating new objects by copying an existing object, known as the prototype. Java
 makes use of the clone() method to achieve this.
* */
public class Main {
    public static void main(String[] args) {
        // Create a prototype instance
        ConcretePrototype originalPrototype = new ConcretePrototype("Original Prototype Name", 666);

        // Clone the prototype to create a new instance
        ConcretePrototype clonedPrototype = (ConcretePrototype) originalPrototype.clone();

        // Display the details of both instances
        System.out.println("Original Prototype: " + originalPrototype);
        System.out.println("Cloned Prototype: " + (clonedPrototype != null ? clonedPrototype : "Clone unsuccessful"));
    }
}