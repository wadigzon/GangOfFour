package org.example;
/*
12. **Proxy Pattern:** Provides a surrogate or placeholder for another object to control access to it.
* */
public class Main {
    public static void main(String[] args) {
        // Using the proxy to perform the request
        Proxy proxy = new Proxy();
        proxy.request();
    }
}