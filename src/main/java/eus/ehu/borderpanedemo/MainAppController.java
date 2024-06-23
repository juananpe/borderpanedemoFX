package eus.ehu.borderpanedemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.*;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class MainAppController {

    private Window followingWin, tootsWin, followersWin;

    public class Window {
        private FxController controller;
        private Parent ui;
    }

    private Window load(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Parent ui = loader.load();
            FxController controller = loader.getController();

            Window window = new Window();
            window.controller = controller;
            window.ui = ui;
            return window;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private BorderPane mainWrapper;
    @FXML
    private Label messageLbl;

    @FXML
    void actionMyToots(ActionEvent event) {
        showScene("Toots");
    }

    @FXML
    void actionFollowers(ActionEvent event) {
        showScene("Followers");
    }

    @FXML
    void actionFollowing(ActionEvent event) {
        showScene("Following");
    }

    @FXML
    void initialize() {

        // bind message label to BusinessLogic.currentUser
        messageLbl.textProperty().bind(BusinessLogic.currentUserProperty());

        followingWin = load("following.fxml");
        followersWin = load("followers.fxml");
        tootsWin = load("toots.fxml");

        showScene("Toots");
    }

    private void showScene(String scene) {
        switch (scene) {
            case "Following" -> mainWrapper.setCenter(followingWin.ui);
            case "Followers" -> mainWrapper.setCenter(followersWin.ui);
            case "Toots" -> mainWrapper.setCenter(tootsWin.ui);
        }
    }

}
