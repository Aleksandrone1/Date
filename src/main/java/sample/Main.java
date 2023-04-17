package  sample;
import com.company.DateTimeUtils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/date.fxml"));
        primaryStage.setTitle("Проект");
        primaryStage.setScene(new Scene(root, 700, 600));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
