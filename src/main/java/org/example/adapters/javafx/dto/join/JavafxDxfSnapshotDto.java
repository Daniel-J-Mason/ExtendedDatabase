
package org.example.adapters.javafx.dto.join;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.adapters.javafx.dto.JavafxDxfDto;
import org.example.application.dto.object.join.DxfSnapshotDto;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public record JavafxDxfSnapshotDto(
        JavafxDxfDto dxf,
        String revisionLevelAtRelease
) implements DxfSnapshotDto {
}
