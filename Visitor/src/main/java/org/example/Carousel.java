package org.example;

public class Carousel implements Attraction{
    @Override
    public void accept(Inspector inspector) {
        inspector.visit(this);
    }
}
