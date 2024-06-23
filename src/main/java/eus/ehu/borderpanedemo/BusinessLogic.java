package eus.ehu.borderpanedemo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BusinessLogic {

    // Define a StringProperty to hold the current user
    private static final StringProperty currentUser = new SimpleStringProperty("Guest");

    // Getter for the currentUser property
    public static StringProperty currentUserProperty() {
        return currentUser;
    }

    // Getter for the currentUser value
    public static String getCurrentUser() {
        return currentUser.get();
    }

    // Setter for the currentUser value
    public static void setCurrentUser(String user) {
        currentUser.set(user);
    }
}
