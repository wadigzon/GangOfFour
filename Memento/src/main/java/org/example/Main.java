package org.example;
/*
18. **Memento Pattern:** Captures and externalizes an object's internal state so that the object can be restored to this
state later.
* */
public class Main {
    public static void main(String[] args) {
        // Create an originator
        Originator originator = new Originator();

        // Create a caretaker
        Caretaker caretaker = new Caretaker(originator);

        // Set and save state
        originator.setState("State 1");
        caretaker.saveState();

        // Change state
        originator.setState("State 2");

        // Save new state
        caretaker.saveState();

        // Restore to the first state
        caretaker.restoreState(0);
        System.out.println("Restored State: " + originator.getState());

        // Restore to the second state
        caretaker.restoreState(1);
        System.out.println("Restored State: " + originator.getState());
    }
}