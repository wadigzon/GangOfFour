package org.example;

import java.util.List;
// Concrete implementation of the iterator interface
public class MyListIterator <T> implements MyIterator<T>{
    private List<T> list;
    private int index;
    public MyListIterator(List<T> list) {
        this.list = list;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return list.get(index++);
        }
        throw new UnsupportedOperationException("No more elements");
    }
}
