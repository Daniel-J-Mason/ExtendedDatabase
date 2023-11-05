package org.example.application.dto.entity.mapper;

import org.example.application.domain.Truck;
import org.example.application.dto.entity.TruckEntity;

public interface TruckEntityMapper<T extends TruckEntity> {
    Truck map(TruckEntity truckEntity);
    
    T map(Truck truck);
}