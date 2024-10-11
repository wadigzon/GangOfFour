package org.example;

public class SafetyInspector implements Inspector {
    @Override
    public void visit(RollerCoaster rollerCoaster) {
        System.out.println("Performing safety inspection on roller coaster");
    }

    @Override
    public void visit(Carousel carousel) {
        System.out.println("Performing safety inspection on carousel");
    }

    @Override
    public void visit(WaterSlide waterSlide) {
        System.out.println("Performing safety inspection on water slide");
    }
}
