package org.example;

public class MaintenanceInspector implements Inspector{

    @Override
    public void visit(RollerCoaster rollerCoaster) {
        System.out.println("Performing maintenance check on roller coaster");
    }

    @Override
    public void visit(Carousel carousel) {
        System.out.println("Performing maintenance check on carousel");
    }

    @Override
    public void visit(WaterSlide waterSlide) {
        System.out.println("Performing maintenance check on water slide");
    }
    
}
