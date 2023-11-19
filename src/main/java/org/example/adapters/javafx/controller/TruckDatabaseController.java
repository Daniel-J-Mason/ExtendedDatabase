package org.example.adapters.javafx.controller;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import org.example.adapters.javafx.components.SQLOperator;
import org.example.adapters.javafx.components.TaggedTextField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public class TruckDatabaseController {
    
    public TextField brandField;
    public TextField dateField;
    public TextField truckNumberField;
    public TextField latestRevisionField;
    public TextField buildNotesField;
    public TextField specialNotesField;
    public TextField modSizeField;
    public TextField conduitField;
    public TextField typeCodeField;
    public TextField skinMaterialField;
    public TextField compartmentField;
    public TextField chassisYearField;
    public TextField chassisMakeField;
    public TextField chassisModelField;
    public TextField customerNameField;
    public TextField designedByField;
    
    public Button searchButton;
    
    private List<TaggedTextField> taggedTextFields;
    
    public void initialize() {
        setupFieldTags();
    }
    
    public void searchButtonClicked() {
        List<String> test = new ArrayList<>();
        for (TaggedTextField taggedTextField: taggedTextFields){
            test.add(
            SQLOperator.CONTAINS.toSQLCondition(taggedTextField.getTag(), taggedTextField.getField().getText()));
        }
        
        test.forEach(System.out::println);
    }
    
    private void setupFieldTags() {
        taggedTextFields = new ArrayList<>(
                Arrays.asList(
                        new TaggedTextField("brand", brandField),
                        new TaggedTextField("date", dateField),
                        new TaggedTextField("truck_number", truckNumberField),
                        new TaggedTextField("revisionLevel", latestRevisionField),
                        new TaggedTextField("main_notes", buildNotesField),
                        new TaggedTextField("special_notes", specialNotesField),
                        new TaggedTextField("mod_size", modSizeField),
                        new TaggedTextField("conduit", conduitField),
                        new TaggedTextField("type_code", typeCodeField),
                        new TaggedTextField("skin_material", skinMaterialField),
                        new TaggedTextField("compartment_material", compartmentField),
                        new TaggedTextField("chassis_year", chassisYearField),
                        new TaggedTextField("chassis_make", chassisMakeField),
                        new TaggedTextField("chassis_model", chassisModelField),
                        new TaggedTextField("customer_name", customerNameField),
                        new TaggedTextField("designed_by", designedByField)
                )
        );
    }
}
