package org.example;
// Concrete visitor
public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visitor is performing operation on ConcreteElementA");
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visitor is performing operation on ConcreteElementB");
        elementB.operationB();
    }
}
