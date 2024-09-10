package org.example;
/*
10. **Facade Pattern:** Provides a simplified interface to a set of interfaces in a subsystem,
making the subsystem easier to use.
* */
public class Main {
    public static void main(String[] args) {
        // Using the facade to perform operations
        Facade facade = new Facade();
        facade.performOperations();
    }
}