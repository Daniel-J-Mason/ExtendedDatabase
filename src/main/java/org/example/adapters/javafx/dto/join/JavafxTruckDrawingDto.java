package org.example.adapters.javafx.dto.join;

import org.example.adapters.javafx.dto.JavafxTruckDto;

public record JavafxTruckDrawingDto(
        JavafxTruckDto truck,
        String revisionLevelAtRelease
) {
}
