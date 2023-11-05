package org.example.application.domain;

import org.example.application.domain.join.TruckDxf;

import java.util.List;
import java.util.UUID;

public record Dxf(
        UUID id,
        String partCode,
        String number,
        String latestRevision,
        String description,
        
        List<TruckDxf> usedOnTrucks
) {
    public String getDrawingNumber(){
        return number.substring(0, 6) + "D";
    }
}
