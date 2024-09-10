package org.example;
// refined abstraction
public class Circle extends Shape{
    private int x, y, radius;
    public Circle(int x, int y, int radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}
