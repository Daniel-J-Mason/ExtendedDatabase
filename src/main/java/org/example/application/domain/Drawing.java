package org.example.application.domain;

import org.example.application.domain.join.TruckDrawing;

import java.util.List;
import java.util.UUID;

public record Drawing(
        UUID id,
        String partCode,
        String number,
        String revisionLevel,
        String description,
        
        List<TruckDrawing> usedOnTrucks
) {
}
