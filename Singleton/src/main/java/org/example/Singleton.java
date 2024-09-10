package org.example;

public class Singleton {
    // Private static instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Optional: You can include initialization code here
    }

    // Public method to get the singleton instance
    public static Singleton getInstance() {
        // Check if the instance is null, then create a new instance
        if (instance == null) {
            instance = new Singleton();
        }
        // Return the singleton instance
        return instance;
    }

    // Optional: Add other methods or properties as needed

    public void showMessage() {
        System.out.println("Hello, I am a org.example.Singleton!");
    }
}
