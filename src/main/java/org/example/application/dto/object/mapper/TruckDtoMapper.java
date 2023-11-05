package org.example.application.dto.object.mapper;

import org.example.application.domain.Truck;
import org.example.application.dto.object.TruckDto;

public interface TruckDtoMapper {
    TruckDto map(Truck truck);
    
    Truck map(TruckDto truckDto);
}
