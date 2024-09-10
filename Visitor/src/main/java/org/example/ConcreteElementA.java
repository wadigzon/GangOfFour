package org.example;

public class ConcreteElementA implements Visitable{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    void operationA() {
        System.out.println("Operation A on ConcreteElementA");
    }
}
