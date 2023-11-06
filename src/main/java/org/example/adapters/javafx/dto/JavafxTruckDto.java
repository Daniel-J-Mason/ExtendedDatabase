package org.example.adapters.javafx.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.adapters.javafx.dto.join.JavafxDrawingSnapshotDto;
import org.example.adapters.javafx.dto.join.JavafxDxfSnapshotDto;
import org.example.application.dto.object.TruckDto;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public record JavafxTruckDto(
        String brand,
        LocalDate date,
        String truckNumber,
        Integer revisionLevel,
        String mainNotes,
        String specialNotes,
        String modSize,
        String conduit,
        Integer typeCode,
        String skinMaterial,
        String compartmentMaterial,
        Integer chassisYear,
        String chassisMake,
        String chassisModel,
        String customerName,
        String designedBy,
        
        List<JavafxDrawingSnapshotDto> drawings,
        List<JavafxDxfSnapshotDto> dxfs
) implements TruckDto {
}
