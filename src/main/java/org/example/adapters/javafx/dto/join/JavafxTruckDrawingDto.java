package org.example.adapters.javafx.dto.join;

import org.example.adapters.javafx.dto.JavafxTruckDto;
import org.example.application.dto.object.join.TruckDrawingDto;

public record JavafxTruckDrawingDto(
        JavafxTruckDto truck,
        String revisionLevelAtRelease
) implements TruckDrawingDto {
}
