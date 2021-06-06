package com.vladimirsimek.benessit.gui;

import com.vladimirsimek.benessit.Main;
import com.vladimirsimek.benessit.data.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ControllerCreatPlayer {

    public ComboBox<String> classChooser;
    public Button playButton;
    public TextField characterName;

    public void initialize() {
        classChooser.getItems().addAll("Archer", "Mage", "Warrior");
    }

    public void play(ActionEvent actionEvent) throws IOException, InterruptedException {
        if (classChooser.getValue() == null) classChooser.setValue("Mage");
        if (characterName.getText().isEmpty()) characterName.setText("vlad");
        Main.player = new Player(classChooser.getValue(), characterName.getText());
        Stage stage = (Stage) playButton.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/rooms/room.fxml")));

        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        stage.setFullScreen(true);
        stage.setResizable(false);
        stage.show();
    }
}
