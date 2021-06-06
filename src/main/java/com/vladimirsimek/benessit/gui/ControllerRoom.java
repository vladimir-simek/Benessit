package com.vladimirsimek.benessit.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class ControllerRoom {

    @FXML
    public Button goUpButton;
    @FXML
    public Button goDownButton;
    @FXML
    public Button goLeftButton;
    @FXML
    public Button goRightButton;
    @FXML
    public Text roomName;
    @FXML
    public Text roomTitle;
    @FXML
    public Text RoomDescription;
    public int a = 0;
    @FXML
    public ImageView lobby;

    public void goUp(ActionEvent actionEvent) {
        a = 10;
        reformRoom(a);
    }

    public void goDown(ActionEvent actionEvent) {
        a = -10;
        reformRoom(a);
    }

    public void goLeft(ActionEvent actionEvent) {
        a = -5;
        reformRoom(a);
    }

    public void goRight(ActionEvent actionEvent) {
        a = 5;
        reformRoom(a);
    }

    public void hide() {
        goDownButton.setOpacity(0);
        goUpButton.setOpacity(0);
        goLeftButton.setOpacity(0);
        goRightButton.setOpacity(0);
        lobby.setOpacity(0);
    }

    public void reformRoom(int a) {
        if (a == 10) {
            hide();
            roomName.setText("ELEVATOR");
            roomTitle.setText("WOW! You died dude!!");
            RoomDescription.setText("A bunch of black people stole your money and lungs.");
            StackPane.setMargin(RoomDescription, new Insets(0,800,600,0));
        } else if (a == -10) {
            hide();
            roomName.setText("OUTSIDE");
            roomTitle.setText("WOW! You died dude!!");
            RoomDescription.setText("An army convoy was passing by and ran over you.");
            StackPane.setMargin(RoomDescription, new Insets(0,800,600,0));
        } else if (a == 5) {
            hide();
            roomName.setText("RECEPTION");
            roomTitle.setText("WOW! You died dude!!");
            RoomDescription.setText("Secretary thought that you are robber because you are black and shot you.");
            StackPane.setMargin(RoomDescription, new Insets(0,200,600,0));
        } else {
            hide();
            roomName.setText("TOILET");
            roomTitle.setText("WOW! You died dude!!");
            RoomDescription.setText("An Asian woman stabbed you because you have an LGBT shirt, she hates gay people.");
            StackPane.setMargin(RoomDescription, new Insets(0,130,600,0));
        }
    }
}
