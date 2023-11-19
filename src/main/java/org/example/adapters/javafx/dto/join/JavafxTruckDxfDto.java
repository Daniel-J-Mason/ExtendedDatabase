package org.example.adapters.javafx.dto.join;

import org.example.adapters.javafx.dto.JavafxTruckDto;
import org.example.application.dto.object.join.TruckDxfDto;

public record JavafxTruckDxfDto(
        JavafxTruckDto truck,
        String revisionLevelAtRelease
) implements TruckDxfDto {
}
