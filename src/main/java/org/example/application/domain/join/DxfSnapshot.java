package org.example.application.domain.join;

import org.example.application.domain.Dxf;

public record DxfSnapshot(
        Dxf dxf,
        String revisionLevelAtRelease
) {
}
