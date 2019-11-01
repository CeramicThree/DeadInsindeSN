package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ProfileButton;

    @FXML
    private Button HomeButton;

    @FXML
    private Button GhoulButton;

    @FXML
    private Button ExitButton;

    @FXML
    private AnchorPane ghoulPane;

    @FXML
    private AnchorPane profilePane;

    @FXML
    private Button friendGhoul;


    @FXML
    void initialize() {
        ExitButton.setOnAction(actionEvent -> {
            Stage stage = (Stage) ExitButton.getScene().getWindow();
            stage.close();
        });

        GhoulButton.setOnAction(actionEvent -> {
            ghoulPane.setVisible(true);
            GhoulButton.setTextFill(Paint.valueOf("Red"));
        });
        ProfileButton.setOnAction(actionEvent -> {
            profilePane.setVisible(true);
            ProfileButton.setTextFill(Paint.valueOf("Red"));
        });


    }
}
