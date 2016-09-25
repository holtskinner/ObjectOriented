/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skinnerhstopwatchfxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author muitprogram
 */
public class FXMLDocumentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private ImageView handImageView;
    
    private double tickTimeInSeconds = 0.01; 
    private final double angleDeltaPerSeconds = 6.0;
    
    private double secondsElapsed = 0;
    
    private Timeline timeline;
    private KeyFrame keyFrame;
    
    
    private void setupTimer() {
        boolean running = false;
        if (timeline != null) {
            if (timeline.getStatus() == Animation.Status.RUNNING) {
                running = true;
                timeline.stop();
            }
        }

        keyFrame = new KeyFrame(Duration.millis(tickTimeInSeconds * 1000), (ActionEvent event) -> {
            update();
        });
        
        timeline = new Timeline(keyFrame);
        timeline.setCycleCount(Animation.INDEFINITE); 
        
        if (running) {
            timeline.play();
        }
    }
    
    @FXML
    private void update() {
        secondsElapsed += tickTimeInSeconds;
        double rotation = secondsElapsed * angleDeltaPerSeconds;
        handImageView.setRotate(rotation);
        
//        digitalClock.setText(String.format("%02d:%02.2f",  
//                            (int)(secondsElapsed/60),
//                            secondsElapsed % 60));
         
    }
    
}
