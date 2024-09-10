package org.example;
// concrete implementor
public class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("API2 - Drawing Circle at (%d, %d) with radius %d%n", x, y, radius);
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.printf("API2 - Drawing Square at (%d, %d) with side %d%n", x, y, side);
    }
}
