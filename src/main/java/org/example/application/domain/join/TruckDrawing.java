package org.example.application.domain.join;

import java.util.UUID;

public record TruckDrawing(
        UUID truckId,
        UUID drawingId,
        String revisionLevel
) {
}
