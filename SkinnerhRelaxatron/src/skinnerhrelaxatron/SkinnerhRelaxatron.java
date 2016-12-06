package skinnerhrelaxatron;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Holt Skinner
 *          skinnerh
 *          Final Project
 */
public class SkinnerhRelaxatron extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Index.fxml"));
        
        Scene scene = new Scene(root);
        
        ViewController.scene = scene;
        ViewController.switchTo("Index");
        stage.setScene(scene);
        stage.setTitle("Relaxatron");
        
        //Sets icon in upper left corner of window
        stage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
