package com.vladimirsimek.benessit.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ControllerCreatPlayer {

    public ComboBox<String> classChooser;
    public Button playButton;

    public void initialize() {
        classChooser.getItems().addAll("Archer", "Mage", "Warrior");
    }

    public void play(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) playButton.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/youDied.xml.fxml")));

        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        stage.setFullScreen(true);
        stage.setResizable(false);
        stage.show();
    }
}
