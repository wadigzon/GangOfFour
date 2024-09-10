package org.example;
/*
8. **Composite Pattern:** Composes objects into tree structures to represent part-whole hierarchies,
allowing clients to treat individual objects and compositions of objects uniformly.
* */
public class Main {
    public static void main(String[] args) {
        // Creating leaf objects
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");
        Component leaf3 = new Leaf("Leaf 3");
        Component leaf4 = new Leaf("Leaf 4");
        Component leaf5 = new Leaf("Leaf 5");
        Component leaf6 = new Leaf("Leaf 6");

        // Creating composite object
        Composite composite = new Composite();

        // Adding leaf objects to the composite
        composite.add(leaf1);
        composite.add(leaf2);
        // Creating a sub sub composite
        Composite subSubComposite = new Composite();
        subSubComposite.add(leaf5);
        subSubComposite.add(leaf6);

        // Adding other composite objects to the main composite
        Composite subComposite = new Composite();
        subComposite.add(leaf3);
        subComposite.add(leaf4);
        subComposite.add(subSubComposite);
        composite.add(subComposite);

        // Performing operation on the main composite, which in turn calls operations on its children
        composite.operation();
    }
}