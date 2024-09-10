package org.example;
/*
21. **Strategy Pattern:** Defines a family of algorithms, encapsulates each algorithm, and makes the algorithms
interchangeable within the family.
* */
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Choose Credit Card payment strategy
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        // Choose PayPal payment strategy
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(50);
    }
}