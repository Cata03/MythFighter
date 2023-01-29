module pi.mythfighter {
    requires javafx.controls;
    requires javafx.fxml;


    opens pi.mythfighter to javafx.fxml;
    exports pi.mythfighter;
}