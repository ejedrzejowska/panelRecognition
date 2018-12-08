package pl.bsh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.IOException;

public class Controller {
    @FXML
    private Text actiontarget;
    @FXML
    private ImageView imageView;


    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        try {
            MyCamera.grabImage();
            FileInputStream inputFile = new FileInputStream("C:\\Users\\Latitude E7440\\IdeaProjects\\images\\test.jpg");
            Image image = new Image(inputFile);
            imageView.setImage(image);
        } catch (IOException e) {
            actiontarget.setText("No imageView loaded");
        }
    }

    @FXML
    protected void verifyButtonAction(ActionEvent actionEvent) {
        actiontarget.setText("Second button pressed");
    }

    @FXML
    protected void getTestButtonAction(ActionEvent actionEvent) {
        actiontarget.setText("Third button pressed");
    }
}
