package org.example.application.domain;

import org.example.application.domain.join.DrawingSnapshot;
import org.example.application.domain.join.DxfSnapshot;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

//TODO: interface that allows the searching of units that contain a set of parts
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
        
        List<DrawingSnapshot> drawings,
        List<DxfSnapshot> dxfs
) {
}