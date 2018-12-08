package pl.bsh;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../../scene_control.fxml"));

        Scene scene = new Scene(root, 600, 600);
        scene.setFill(Color.DARKCYAN);
        //primaryStage.getIcons().add(new Image("C:\\Users\\Latitude E7440\\Pictures"));
        primaryStage.setTitle("Panel Recognition");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
