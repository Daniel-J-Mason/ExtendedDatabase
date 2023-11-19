package org.example.application.dto.object;

import org.example.adapters.javafx.dto.join.JavafxTruckDxfDto;

import java.util.List;
import java.util.UUID;

public interface DxfDto{
    UUID id();
    
    String partCode();
    
    String number();
    
    String latestRevision();
    
    String description();
    
    List<JavafxTruckDxfDto> usedOnTrucks();
}
