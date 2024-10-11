package org.example;

public class VisitorDemo {
    public static void main(String[] args) {
        ThemePark park = new ThemePark();
        
        Inspector safetyInspector = new SafetyInspector();
        Inspector maintenanceInspector = new MaintenanceInspector();

        System.out.println("Safety Inspection:");
        park.accept(safetyInspector);

        System.out.println("\nMaintenance Inspection:");
        park.accept(maintenanceInspector);
    }
}
