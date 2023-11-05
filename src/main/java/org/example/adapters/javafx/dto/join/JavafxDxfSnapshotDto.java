
package org.example.adapters.javafx.dto.join;

import org.example.adapters.javafx.dto.JavafxDxfDto;

public record JavafxDxfSnapshotDto(
        JavafxDxfDto dxf,
        String revisionLevelAtRelease
) {
}
