package org.example;

public class RollerCoaster implements Attraction {
    @Override
    public void accept(Inspector inspector) {
        inspector.visit(this);
    }
}
