import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/SplashScreenForm.fxml"));
        Scene splashScene = new Scene(root);
        primaryStage.setScene(splashScene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        splashScene.setFill(Color.TRANSPARENT);
        primaryStage.centerOnScreen();
        primaryStage.setTitle("Student Attendance System");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
