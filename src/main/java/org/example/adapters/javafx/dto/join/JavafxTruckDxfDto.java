package org.example.adapters.javafx.dto.join;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.adapters.javafx.dto.JavafxTruckDto;
import org.example.application.dto.object.join.TruckDxfDto;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public record JavafxTruckDxfDto(
        JavafxTruckDto truck,
        String revisionLevelAtRelease
) implements TruckDxfDto {
}
