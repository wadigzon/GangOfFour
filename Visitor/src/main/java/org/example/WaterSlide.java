package org.example;

public class WaterSlide implements Attraction{

    @Override
    public void accept(Inspector inspector) {
        inspector.visit(this);
    }
    
}
