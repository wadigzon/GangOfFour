package org.example;

public interface Handler {
    void handleRequest(Request request);
    void setNextHandler(Handler nextHandler);
}
