package org.example;
/*
16. **Iterator Pattern:** Provides a way to access the elements of an aggregate object sequentially without exposing its
underlying representation.
* */
public class Main {
    public static void main(String[] args) {
        // Creating a collection
        MyListCollection<String> myCollection = new MyListCollection<>();

        // Adding elements to the collection
        myCollection.add("Item 1");
        myCollection.add("Item 2");
        myCollection.add("Item 3");

        // Getting the iterator and iterating over the collection
        MyIterator<String> iterator = myCollection.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Element: " + item);
        }
    }
}