package org.example;
public class ConcreteHandler1 implements Handler {
    private Handler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE1)) {
            System.out.println("ConcreteHandler1 handling request of Type1");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
