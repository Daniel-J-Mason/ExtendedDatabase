package org.example.adapters.javafx.dto;

import org.example.adapters.javafx.dto.join.JavafxTruckDxfDto;

import java.util.List;
import java.util.UUID;

public record JavafxDxfDto(
        UUID id,
        String partCode,
        String number,
        String latestRevision,
        String description,
        
        List<JavafxTruckDxfDto> usedOnTrucks
) {
}
