package org.example.adapters.settings;

import lombok.Builder;
import lombok.Data;

import java.util.TreeMap;

@Data
@Builder
public class ApplicationSettings {
    private String engineeringWorkingFolder;
    private String drawingsFolder;
    private String dxfFolder;
    private TreeMap<Integer, Integer> drawingPrefixes;
    private TreeMap<Integer, Integer> dxfPrefixes;
    private String defaultTransmittalLayout;
    private boolean isDarkMode;
    private String helpFolder;
}
