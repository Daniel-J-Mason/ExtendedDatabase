
package org.example.adapters.javafx.dto.join;

import org.example.adapters.javafx.dto.JavafxDxfDto;
import org.example.application.dto.object.join.DxfSnapshotDto;

public record JavafxDxfSnapshotDto(
        JavafxDxfDto dxf,
        String revisionLevelAtRelease
) implements DxfSnapshotDto {
}
