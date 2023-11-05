package org.example.application.dto.entity;

import org.example.application.domain.join.DrawingSnapshot;
import org.example.application.domain.join.DxfSnapshot;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface TruckEntity {
    UUID getId();
    
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
    
    List<? extends DrawingSnapshot> getDrawings();
    
    List<? extends DxfSnapshot> getDxfs();
}
