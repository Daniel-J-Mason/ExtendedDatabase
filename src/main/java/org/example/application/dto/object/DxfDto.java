package org.example.application.dto.object;

import org.example.application.dto.object.join.mapper.TruckDxfDto;

import java.util.List;
import java.util.UUID;

public interface DxfDto{
    UUID getId();
    
    String getPartCode();
    
    String getNumber();
    
    String getLatestRevision();
    
    String getDescription();
    
    List<? extends TruckDxfDto> getUsedOnTrucks();
}
