package org.example.application.dto.object;

import org.example.application.dto.object.join.TruckDrawingDto;

import java.util.List;
import java.util.UUID;

public interface DrawingDto{
    UUID id();
    
    String partCode();
    
    String number();
    
    String latestRevision();
    
    String description();
    
    List<? extends TruckDrawingDto> usedOnTrucks();
}
