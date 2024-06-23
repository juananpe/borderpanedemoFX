package eus.ehu.borderpanedemo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FollowersController implements FxController{

    @FXML
    private Button changeBtn;

    @FXML
    void actionChange(ActionEvent event) {
        System.out.println("Change button clicked");
        BusinessLogic.setCurrentUser("John Doe");

    }

    @FXML
    void initialize() {
        System.out.println("Followers controller initialized");
    }
}
