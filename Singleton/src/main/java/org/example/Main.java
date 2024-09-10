package org.example;

/*
1.Singleton Pattern:
Ensures a class has only one instance and provides a global point of access to it.
* */
public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the singleton instance
        singleton.showMessage();
    }
}