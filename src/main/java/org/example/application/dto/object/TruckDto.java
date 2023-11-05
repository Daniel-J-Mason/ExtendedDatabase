package org.example.application.dto.object;

import java.time.LocalDate;

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
}
