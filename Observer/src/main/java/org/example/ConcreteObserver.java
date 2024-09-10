package org.example;

public class ConcreteObserver implements Observer{

    private ConcreteSubject subject;
    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Observer updated with state: " + subject.getState());
    }
}
