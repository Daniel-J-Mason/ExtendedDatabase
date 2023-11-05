package org.example.application.domain.join;

import org.example.application.domain.Drawing;

public record DrawingSnapshot(
        Drawing drawing,
        String revisionLevelAtRelease
) {
}
