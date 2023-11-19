package org.example.application.dto.object;

import org.example.application.dto.object.join.DrawingSnapshotDto;
import org.example.application.dto.object.join.DxfSnapshotDto;

import java.time.LocalDate;
import java.util.List;

public interface TruckDto {
    String brand();
    
    LocalDate date();
    
    String truckNumber();
    
    Integer revisionLevel();
    
    String mainNotes();
    
    String specialNotes();
    
    String modSize();
    
    String conduit();
    
    Integer typeCode();
    
    String skinMaterial();
    
    String compartmentMaterial();
    
    Integer chassisYear();
    
    String chassisMake();
    
    String chassisModel();
    
    String customerName();
    
    String designedBy();
    
    List<? extends DrawingSnapshotDto> drawings();
    
    List<? extends DxfSnapshotDto> dxfs();
}
