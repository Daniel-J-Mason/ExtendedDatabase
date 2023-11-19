package org.example.application.dto.object.join;

import org.example.application.dto.object.DxfDto;

public interface DxfSnapshotDto {
    DxfDto dxf();

    String revisionLevelAtRelease();
}
