package org.example.adapters.javafx.dto;

import org.example.adapters.javafx.dto.join.JavafxTruckDrawingDto;
import org.example.application.dto.object.DrawingDto;

import java.util.List;
import java.util.UUID;

public record JavafxDrawingDto(
        UUID id,
        String partCode,
        String number,
        String latestRevision,
        String description,
        
        List<JavafxTruckDrawingDto> usedOnTrucks
) implements DrawingDto{
}
