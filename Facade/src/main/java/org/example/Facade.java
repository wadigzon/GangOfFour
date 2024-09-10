package org.example;
// Facade
public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;
    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }

    // Facade methods that simplify the subsystem operations
    public void performOperations() {
        System.out.println("Facade is performing operations:");
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}
