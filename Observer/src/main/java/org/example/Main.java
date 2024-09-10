package org.example;
/*
19. **Observer Pattern:** Defines a one-to-many dependency between objects so that when one object changes state, all
its dependents are notified and updated automatically.
* */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);
        ConcreteObserver observer3 = new ConcreteObserver(subject);
        ConcreteObserver observer4 = new ConcreteObserver(subject);

        // Changing the state will notify all observers
        subject.setState(1);
        subject.setState(2);

    }
}