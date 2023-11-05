package org.example.adapters.javafx.dto.join;

import org.example.adapters.javafx.dto.JavafxDrawingDto;

public record JavafxDrawingSnapshotDto(
        JavafxDrawingDto drawing,
        String revisionLevelAtRelease
) {
}
