package org.example.application.domain.join;

import java.util.UUID;

public record TruckDxf(
        UUID truckId,
        UUID dxfId,
        String revisionLevel
) {
}
