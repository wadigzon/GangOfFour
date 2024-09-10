package org.example;
// Originator: The object whose state needs to be saved
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    // Save state to Memento
    public Memento saveToMemento() {
        return new Memento(state);
    }

    // Restore state from Memento
    public void restoreFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}
