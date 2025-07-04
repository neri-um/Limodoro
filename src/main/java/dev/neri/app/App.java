package dev.neri.app;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/dev/neri/vistas/MainView.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Limodoro");
        stage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("/dev/neri/recursos/limondoro.png")));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
