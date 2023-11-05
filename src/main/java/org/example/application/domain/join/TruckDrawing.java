package org.example.application.domain.join;

import org.example.application.domain.Truck;

import java.util.UUID;

public record TruckDrawing(
        Truck truck,
        String revisionLevelAtRelease
) {
}
