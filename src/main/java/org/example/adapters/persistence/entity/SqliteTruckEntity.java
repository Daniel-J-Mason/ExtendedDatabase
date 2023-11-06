package org.example.adapters.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.application.domain.join.DrawingSnapshot;
import org.example.application.domain.join.DxfSnapshot;
import org.example.application.dto.entity.TruckEntity;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SqliteTruckEntity implements TruckEntity {
    private UUID id;
    private String brand;
    private LocalDate date;
    private String truckNumber;
    private Integer revisionLevel;
    private String mainNotes;
    private String specialNotes;
    private String modSize;
    private String conduit;
    private Integer typeCode;
    private String skinMaterial;
    private String compartmentMaterial;
    private Integer chassisYear;
    private String chassisMake;
    private String chassisModel;
    private String customerName;
    private String designedBy;
    
    private List<DrawingSnapshot> drawings;//TODO EXTENDS
    private List<DxfSnapshot> dxfs;
}
