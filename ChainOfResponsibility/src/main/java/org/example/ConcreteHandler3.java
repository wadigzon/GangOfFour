package org.example;

public class ConcreteHandler3 implements Handler {
    private Handler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE3)) {
            System.out.println("ConcreteHandler3 handling request of Type3");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
