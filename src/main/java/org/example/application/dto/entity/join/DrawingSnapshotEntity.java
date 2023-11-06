package org.example.application.dto.entity.join;

import org.example.application.dto.entity.DrawingEntity;

public interface DrawingSnapshotEntity{
    DrawingEntity getDrawing();

    String getRevisionLevelAtRelease();

}
