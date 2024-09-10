package org.example;

public class RectangleAdapter implements Shape{
    LegacyRectangle legacyRectangle;
    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }
    @Override
    public int getArea() {
        return legacyRectangle.calculateArea();
    }
}
