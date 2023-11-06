package org.example.application.dto.entity;

import org.example.application.dto.entity.join.TruckDrawingEntity;

import java.util.List;
import java.util.UUID;

public interface DrawingEntity{
    UUID getId();
    
    String getPartCode();
    
    String getNumber();
    
    String getLatestRevision();
    
    String getDescription();
    
    List<? extends TruckDrawingEntity> getUsedOnTrucks();
}
