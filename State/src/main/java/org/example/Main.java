package org.example;
/*
20. **State Pattern:** Allows an object to alter its behavior when its internal state changes, providing the object with
the appearance of having changed its class.
* */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // Request in State A
        context.request();

        // Request in State B
        context.request();
    }
}