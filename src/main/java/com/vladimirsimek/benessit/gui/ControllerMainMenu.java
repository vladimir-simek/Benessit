package com.vladimirsimek.benessit.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ControllerMainMenu {
    @FXML
    public Button exitButton;
    @FXML
    public Button playButton;
    @FXML
    public ComboBox<String> classChooser;

    @FXML
    public void initialize() {
        /*ObservableList<String> classes = FXCollections.observableArrayList(
                "Mage",
                "Warrior",
                "Archer"
        );
        classChooser = new ComboBox<>(classes);
        classChooser.setItems(classes);
        classChooser.getItems().addAll(classes);
        classChooser.setPromptText("Choose class");*/

    }


    public void exitGame(ActionEvent actionEvent) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    public void switchToCreatePlayer(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/createPlayer.fxml")));

        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        stage.setFullScreen(true);
        stage.setResizable(false);
        stage.show();
    }


}
