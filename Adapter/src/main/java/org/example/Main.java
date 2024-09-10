package org.example;

/*
6.Adapter Pattern:
Allows the interface of an existing class to be used as another interface.
* */
public class Main {
    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle(3, 7);
        Shape shapeAdapter = new RectangleAdapter(legacyRectangle);

        // Now, you can use shapeAdapter as if it's any other Shape
        int area = shapeAdapter.getArea();
        System.out.println("Area: " + area);
    }
}