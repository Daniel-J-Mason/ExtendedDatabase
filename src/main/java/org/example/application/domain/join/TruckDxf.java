package org.example.application.domain.join;

import org.example.application.domain.Truck;

public record TruckDxf(
        Truck truck,
        String revisionLevelAtRelease
) {
}
