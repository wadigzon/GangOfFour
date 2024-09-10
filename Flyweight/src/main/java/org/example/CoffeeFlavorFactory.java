package org.example;

import java.util.HashMap;
import java.util.Map;
// Flyweight Factory
public class CoffeeFlavorFactory {
    private final Map<String, CoffeeFlavor> flavors = new HashMap<>();

    public CoffeeFlavor getCoffeeFlavor(String flavorName) {
        CoffeeFlavor flavor = flavors.get(flavorName);

        if (flavor == null) {
            flavor = new CoffeeFlavor(flavorName);
            flavors.put(flavorName, flavor);
        }

        return flavor;
    }
}
