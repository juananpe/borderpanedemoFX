module eus.ehu.borderpanedemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eus.ehu.borderpanedemo to javafx.fxml;
    exports eus.ehu.borderpanedemo;
}
