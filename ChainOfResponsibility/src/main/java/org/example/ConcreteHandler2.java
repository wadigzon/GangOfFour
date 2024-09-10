package org.example;

public class ConcreteHandler2 implements Handler {
    private Handler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE2)) {
            System.out.println("ConcreteHandler2 handling request of Type2");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
