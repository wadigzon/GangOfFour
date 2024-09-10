package org.example;

public class ConcreteElementB implements Visitable{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    void operationB() {
        System.out.println("Operation B on ConcreteElementB");
    }
}
