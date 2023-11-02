package org.example.application.domain;

public record Drawing(
        String partCode,
        String number,
        String revisionLevel,
        String description
) {
}
