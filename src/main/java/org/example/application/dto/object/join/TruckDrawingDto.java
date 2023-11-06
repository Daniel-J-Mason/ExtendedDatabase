package org.example.application.dto.object.join;

import org.example.application.domain.Truck;

public interface TruckDrawingDto{
    Truck getTruck();
    
    String getRevisionLevelAtRelease();
}
