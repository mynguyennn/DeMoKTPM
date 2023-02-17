module com.npnp.bmiappca2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.npnp.bmiappca2 to javafx.fxml;
    exports com.npnp.bmiappca2;
}
