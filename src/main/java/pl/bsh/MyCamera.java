package pl.bsh;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import com.github.sarxos.webcam.Webcam;

public class MyCamera {

    private BufferedImage image;

    public static void grabImage(){

        Webcam webcam = Webcam.getDefault();
        webcam.open();
        BufferedImage image = webcam.getImage();
        try {
            ImageIO.write(image, "JPG", new File("C:\\Users\\Latitude E7440\\IdeaProjects\\images\\test.jpg"));
        } catch (IOException e) {
            System.out.println("w grabImage()");
            e.printStackTrace();
        }
        finally {
            webcam.close();
        }

    }
}
