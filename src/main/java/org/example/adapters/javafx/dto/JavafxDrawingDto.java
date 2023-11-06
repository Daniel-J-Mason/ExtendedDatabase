package org.example.adapters.javafx.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.adapters.javafx.dto.join.JavafxTruckDrawingDto;
import org.example.application.dto.object.DrawingDto;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
@Builder
@RequiredArgsConstructor
public record JavafxDrawingDto(
        UUID id,
        String partCode,
        String number,
        String latestRevision,
        String description,
        
        List<JavafxTruckDrawingDto> usedOnTrucks
) implements DrawingDto{
}
