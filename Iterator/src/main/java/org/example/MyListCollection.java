package org.example;

import java.util.ArrayList;
import java.util.List;
// Concrete implementation of the collection interface
public class MyListCollection <T> implements MyCollection<T>{
    private List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }
    @Override
    public MyIterator<T> iterator() {
        return new MyListIterator<>(list);
    }
}
