package org.example;
// Context class
public class Context {
    private State state;

    public Context() {
        // Initial state
        this.state = new StateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
