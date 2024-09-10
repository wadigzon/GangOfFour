package org.example;

import java.util.ArrayList;
import java.util.List;

// Caretaker class (holds and manages multiple mementos)
public class Caretaker {
    private final Originator originator;
    private final List<Memento> mementos = new ArrayList<>();

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void saveState() {
        mementos.add(originator.saveToMemento());
    }

    public void restoreState(int index) {
        if (index >= 0 && index < mementos.size()) {
            originator.restoreFromMemento(mementos.get(index));
        }
    }
}
