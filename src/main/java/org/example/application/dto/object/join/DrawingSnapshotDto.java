package org.example.application.dto.object.join;

import org.example.application.dto.object.DrawingDto;

public interface DrawingSnapshotDto{
    DrawingDto getDrawing();

    String getRevisionLevelAtRelease();

}
