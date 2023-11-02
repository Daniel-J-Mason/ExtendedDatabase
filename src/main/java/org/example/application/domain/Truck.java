package org.example.application.domain;

import org.example.application.domain.join.TruckDrawing;
import org.example.application.domain.join.TruckDxf;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record Truck(
        UUID id,
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
        
        List<TruckDrawing> drawings,
        List<TruckDxf> dxfs
) {
}