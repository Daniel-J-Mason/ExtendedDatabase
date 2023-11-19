package org.example.adapters.javafx.dto.join;

import org.example.adapters.javafx.dto.JavafxDrawingDto;
import org.example.application.dto.object.join.DrawingSnapshotDto;

public record JavafxDrawingSnapshotDto(
        JavafxDrawingDto drawing,
        String revisionLevelAtRelease
) implements DrawingSnapshotDto {
}
