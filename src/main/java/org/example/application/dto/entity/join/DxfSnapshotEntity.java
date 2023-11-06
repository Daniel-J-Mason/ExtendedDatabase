package org.example.application.dto.entity.join;

import org.example.application.dto.entity.DxfEntity;

public interface DxfSnapshotEntity {
    DxfEntity getDxf();

    String getRevisionLevelAtRelease();
}
