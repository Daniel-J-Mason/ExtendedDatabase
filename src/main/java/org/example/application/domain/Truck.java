package org.example.application.domain;

import java.time.LocalDate;

public record Truck(
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
        String designedBy
) {
}