package org.example.application.dto.entity;

import org.example.application.dto.entity.join.TruckDxfEntity;

import java.util.List;
import java.util.UUID;

public interface DxfEntity{
    UUID getId();

    String getPartCode();

    String getNumber();

    String getLatestRevision();

    String getDescription();
    
    List<? extends TruckDxfEntity> getUsedOnTrucks();
    
}
