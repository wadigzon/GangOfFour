package org.example;
/*
7. **Bridge Pattern:**
Separates an object’s abstraction from its implementation so that the two can vary independently.
* */
/*
This example demonstrates how you can use the Bridge Pattern
to interchangeably use different drawing APIs (implementations)
with different shapes (abstractions).
The abstraction and implementation are decoupled,
allowing for flexibility and extensibility in the system.
**/

public class Main {
    public static void main(String[] args) {
        DrawingAPI api1 = new DrawingAPI1();
        DrawingAPI api2 = new DrawingAPI2();

        Shape circle = new Circle(1, 2, 3, api1);
        Shape square = new Square(4, 5, 6, api2);

        circle.draw();
        square.draw();
    }
}