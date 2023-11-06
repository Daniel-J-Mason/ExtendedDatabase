package org.example.application.dto.object;

import org.example.application.dto.object.join.DrawingSnapshotDto;
import org.example.application.dto.object.join.DxfSnapshotDto;

import java.time.LocalDate;
import java.util.List;

public interface TruckDto {
    String getBrand();
    
    LocalDate getDate();
    
    String getTruckNumber();
    
    Integer getRevisionLevel();
    
    String getMainNotes();
    
    String getSpecialNotes();
    
    String getModSize();
    
    String getConduit();
    
    Integer getTypeCode();
    
    String getSkinMaterial();
    
    String getCompartmentMaterial();
    
    Integer getChassisYear();
    
    String getChassisMake();
    
    String getChassisModel();
    
    String getCustomerName();
    
    String getDesignedBy();
    
    List<? extends DrawingSnapshotDto> getDrawings();
    
    List<? extends DxfSnapshotDto> getDxfs();
}
