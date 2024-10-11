package org.example;

// Visitor interface
interface Inspector {
    void visit(RollerCoaster rollerCoaster);
    void visit(Carousel carousel);
    void visit(WaterSlide waterSlide);    
}
