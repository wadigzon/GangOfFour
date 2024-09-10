package org.example;
/*
4.Builder Pattern:
Separates the construction of a complex object from its representation,
allowing the same construction process to create various representations.
* */
public class Main {
    public static void main(String[] args) {
        // Using the builder to create a Person object
        Person person = new Person.PersonBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .setAddress("123 Main St")
                .build();

        // Accessing the built Person object
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}