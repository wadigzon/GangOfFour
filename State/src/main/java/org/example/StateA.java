package org.example;

public class StateA implements State{
    @Override
    public void handle(Context context) {
        System.out.println("Handling request in State A");
        // Transition to State B
        context.setState(new StateB());
    }
}
