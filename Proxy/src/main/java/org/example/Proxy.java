package org.example;

public class Proxy implements RealSubject{
    private RealSubject realSubject;
    @Override
    public void request() {
// Check if the realSubject is instantiated, if not, create it
        if (realSubject == null) {
            realSubject = new RealSubjectImpl();
        }

        // Perform some additional actions before delegating to the realSubject
        System.out.println("Proxy: Performing pre-request actions.");

        // Delegate the request to the realSubject
        realSubject.request();

        // Perform some additional actions after delegating to the realSubject
        System.out.println("Proxy: Performing post-request actions.");
    }
}
