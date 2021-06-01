package com.vladimirsimek.benessit.gui;

import javafx.scene.control.ComboBox;

public class ControllerCreatPlayer {

    public ComboBox<String> classChooser;

    public void initialize() {
        classChooser.getItems().addAll("Archer", "Mage", "Warrior");
    }
}
