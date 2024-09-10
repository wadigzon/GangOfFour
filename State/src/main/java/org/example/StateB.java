package org.example;

public class StateB implements State{
    @Override
    public void handle(Context context) {
        System.out.println("Handling request in State B");
        // Transition back to State A
        context.setState(new StateA());
    }
}
