package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage calStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        calStage.setTitle("Calculater");
        calStage.setScene(new Scene(root, 300, 388));
        Image icon = new Image("calp.png");
        calStage.getIcons().add(icon);
        calStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
