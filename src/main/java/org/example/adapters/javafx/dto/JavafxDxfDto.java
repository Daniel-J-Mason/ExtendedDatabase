package org.example.adapters.javafx.dto;

import org.example.adapters.javafx.dto.join.JavafxTruckDxfDto;
import org.example.application.dto.object.DxfDto;

import java.util.List;
import java.util.UUID;

public record JavafxDxfDto(
        UUID id,
        String partCode,
        String number,
        String latestRevision,
        String description,
        
        List<JavafxTruckDxfDto> usedOnTrucks
) implements DxfDto {
}
