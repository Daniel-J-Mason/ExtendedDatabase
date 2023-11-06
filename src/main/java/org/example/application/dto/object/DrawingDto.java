package org.example.application.dto.object;

import org.example.application.dto.object.join.TruckDrawingDto;

import java.util.List;
import java.util.UUID;

public interface DrawingDto{
    UUID getId();
    
    String getPartCode();
    
    String getNumber();
    
    String getLatestRevision();
    
    String getDescription();
    
    List<? extends TruckDrawingDto> getUsedOnTrucks();
}