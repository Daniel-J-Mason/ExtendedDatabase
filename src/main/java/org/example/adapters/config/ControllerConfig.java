package org.example.adapters.config;

import org.example.adapters.javafx.controller.LaunchPageController;
import org.example.adapters.javafx.controller.TruckDatabaseController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {
    
    @Bean
    LaunchPageController launchPageController(){ //TODO add ports here
        return new LaunchPageController();
    }
    
    @Bean
    TruckDatabaseController truckDatabaseController(){
        return new TruckDatabaseController();
    }
}
