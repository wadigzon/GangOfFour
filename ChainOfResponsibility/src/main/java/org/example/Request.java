package org.example;
public class Request {
    private RequestType type;
    public Request(RequestType type) {
        this.type = type;
    }
    public RequestType getType() {
        return type;
    }
}
