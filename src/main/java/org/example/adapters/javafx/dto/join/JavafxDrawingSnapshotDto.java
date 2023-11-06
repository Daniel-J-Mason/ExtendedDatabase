package org.example.adapters.javafx.dto.join;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.adapters.javafx.dto.JavafxDrawingDto;
import org.example.application.dto.object.join.DrawingSnapshotDto;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public record JavafxDrawingSnapshotDto(
        JavafxDrawingDto drawing,
        String revisionLevelAtRelease
) implements DrawingSnapshotDto {
}
