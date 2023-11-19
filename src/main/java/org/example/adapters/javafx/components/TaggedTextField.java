package org.example.adapters.javafx.components;

import javafx.scene.control.TextField;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TaggedTextField {
    private String tag;
    private TextField field;
}
