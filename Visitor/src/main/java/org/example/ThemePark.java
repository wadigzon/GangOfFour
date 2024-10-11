package org.example;

import java.util.ArrayList;
import java.util.List;

public class ThemePark {
    private List<Attraction> attractions;

    public ThemePark() {
        attractions = new ArrayList<>();
        attractions.add(new RollerCoaster());
        attractions.add(new Carousel());
        attractions.add(new WaterSlide());
    }

    public void accept(Inspector inspector) {
        for (Attraction attraction : attractions) {
            attraction.accept(inspector);
        }
    }    
}
