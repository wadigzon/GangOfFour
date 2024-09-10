package org.example;
/*
23. **Visitor Pattern:** Represents an operation to be performed on the elements of an object structure. Allows the
definition of new operations without changing the classes of the elements on which it operates.
* */
public class Main {
    public static void main(String[] args) {
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();

        Visitor visitor = new ConcreteVisitor();

        // Applying the visitor to elements
        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}