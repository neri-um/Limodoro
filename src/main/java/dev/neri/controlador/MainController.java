package dev.neri.controlador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.text.Font;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    public void initialize() {
        Font.loadFont(getClass().getResourceAsStream("/dev/neri/fuentes/pixel-game.regular.otf"), 18);
    }


}
