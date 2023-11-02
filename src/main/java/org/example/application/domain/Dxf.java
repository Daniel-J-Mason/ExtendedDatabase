package org.example.application.domain;

public record Dxf(
        String partCode,
        String number,
        String revisionLevel,
        String description
) {
    public String getDrawingNumber(){
        return number.substring(0, 6) + "D";
    }
}
