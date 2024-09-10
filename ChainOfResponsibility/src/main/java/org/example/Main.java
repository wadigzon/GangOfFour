package org.example;
/*
13. **Chain of Responsibility Pattern:** Passes the request along a chain of handlers, each handling the request or
passing it to the next handler in the chain.
* */
public class Main {
    public static void main(String[] args) {
        // Creating the chain of handlers
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        // Creating requests
        Request request1 = new Request(RequestType.TYPE1);
        Request request2 = new Request(RequestType.TYPE2);
        Request request3 = new Request(RequestType.TYPE3);

        // Handling requests
        handler1.handleRequest(request1);   // handles right request
        handler1.handleRequest(request2);   // passes it to handler2

        handler2.handleRequest(request2);   // handles right request
        handler2.handleRequest(request3);   // passes it to handler3
    }
}